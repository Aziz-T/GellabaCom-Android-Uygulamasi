package com.t.gellaba;

public class PostModel {
    private String baslik, resimUrl, pageUrl;

    public PostModel() {
    }

    public PostModel(String baslik, String resimUrl) {
        this.baslik = baslik;
        this.resimUrl = resimUrl;
    }

    public PostModel(String baslik, String resimUrl, String pageUrl) {
        this.baslik = baslik;
        this.resimUrl = resimUrl;
        this.pageUrl = pageUrl;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getResimUrl() {
        return resimUrl;
    }

    public void setResimUrl(String resimUrl) {
        this.resimUrl = resimUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
}
