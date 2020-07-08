package com.elfeky.hamza.testevent.ui.home.listview;

public class ListModelHome {

    private int img_back;
    private int img_fav;
    private int img_icon;
    private String title;

    public ListModelHome(int img_back, int img_fav, int img_icon, String title) {
        this.img_back = img_back;
        this.img_fav = img_fav;
        this.img_icon = img_icon;
        this.title = title;
    }

    public ListModelHome() {
    }

    public int getImg_back() {
        return img_back;
    }

    public void setImg_back(int img_back) {
        this.img_back = img_back;
    }

    public int getImg_fav() {
        return img_fav;
    }

    public void setImg_fav(int img_fav) {
        this.img_fav = img_fav;
    }

    public int getImg_icon() {
        return img_icon;
    }

    public void setImg_icon(int img_icon) {
        this.img_icon = img_icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
