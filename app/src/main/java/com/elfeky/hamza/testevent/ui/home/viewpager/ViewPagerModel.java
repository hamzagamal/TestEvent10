package com.elfeky.hamza.testevent.ui.home.viewpager;

public class ViewPagerModel {

    private int image_page;
    private String title;
    private String date;
    private int image_fav;

    public ViewPagerModel() {
    }

    public ViewPagerModel(int image_page, String title, String date, int image_fav) {

        this.image_page = image_page;
        this.title = title;
        this.date = date;
        this.image_fav = image_fav;
    }

    public int getImage_page() {
        return image_page;
    }

    public void setImage_page(int image_page) {
        this.image_page = image_page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage_fav() {
        return image_fav;
    }

    public void setImage_fav(int image_fav) {
        this.image_fav = image_fav;
    }
}
