package com.t.gellaba;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<PostModel> postModelList;

    public PostAdapter(List<PostModel> postModelList) {
        this.postModelList = postModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(postModelList.get(position).getBaslik(),postModelList.get(position).getResimUrl(),postModelList.get(position).getPageUrl());
    }

    @Override
    public int getItemCount() {
        return postModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.postImage);
            textView=itemView.findViewById(R.id.baslikText);
        }

        public void setData(String baslik, String resimUrl, String pageUrl) {
            Glide.with(itemView.getContext()).load(resimUrl).into(imageView);
            textView.setText(baslik);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),PostActivity.class);
                    intent.putExtra("url",pageUrl);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
