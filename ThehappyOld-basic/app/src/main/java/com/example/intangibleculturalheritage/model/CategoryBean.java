package com.example.intangibleculturalheritage.model;

public class CategoryBean {
    private int res;
    private String title;


    public CategoryBean(int res, String title) {
        this.res = res;
        this.title = title;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
