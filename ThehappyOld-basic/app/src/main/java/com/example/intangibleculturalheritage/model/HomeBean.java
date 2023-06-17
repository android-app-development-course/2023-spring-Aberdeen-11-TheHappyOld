package com.example.intangibleculturalheritage.model;

public class HomeBean {

    private String title;
    private int imgRes;
    private String startTime;
    private String endTime;
    private  String price;

    public HomeBean(String title, int imgRes, String startTime, String endTime, String price) {
        this.title = title;
        this.imgRes = imgRes;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
