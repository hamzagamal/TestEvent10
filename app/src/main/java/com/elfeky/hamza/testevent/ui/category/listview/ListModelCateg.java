package com.elfeky.hamza.testevent.ui.category.listview;

public class ListModelCateg {
    private int img_back_cat;
    private int img_fav_cat;
    private int img_icon_cat;
    private String title_cat;

    public ListModelCateg(int img_back, int img_fav, int img_icon, String title) {
        this.img_back_cat = img_back;
        this.img_fav_cat = img_fav;
        this.img_icon_cat = img_icon;
        this.title_cat = title;
    }

    public ListModelCateg() {
    }

    public int getImg_back() {
        return img_back_cat;
    }

    public void setImg_back(int img_back) {
        this.img_back_cat = img_back;
    }

    public int getImg_fav() {
        return img_fav_cat;
    }

    public void setImg_fav(int img_fav) {
        this.img_fav_cat = img_fav;
    }

    public int getImg_icon() {
        return img_icon_cat;
    }

    public void setImg_icon(int img_icon) {
        this.img_icon_cat = img_icon;
    }

    public String getTitle() {
        return title_cat;
    }

    public void setTitle(String title) {
        this.title_cat = title;
    }
}
