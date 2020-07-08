package com.elfeky.hamza.testevent.ui.ticket.listviewtick;

public class ListModelTick {

    private int tick_img;
    private String tick_title;
    private String tick_date;
    private String tick_adress;

    public ListModelTick() {
    }

    public ListModelTick(int tick_img, String tick_title, String tick_date, String tick_adress) {
        this.tick_img = tick_img;
        this.tick_title = tick_title;
        this.tick_date = tick_date;
        this.tick_adress = tick_adress;
    }

    public int getTick_img() {
        return tick_img;
    }

    public void setTick_img(int tick_img) {
        this.tick_img = tick_img;
    }

    public String getTick_title() {
        return tick_title;
    }

    public void setTick_title(String tick_title) {
        this.tick_title = tick_title;
    }

    public String getTick_date() {
        return tick_date;
    }

    public void setTick_date(String tick_date) {
        this.tick_date = tick_date;
    }

    public String getTick_adress() {
        return tick_adress;
    }

    public void setTick_adress(String tick_adress) {
        this.tick_adress = tick_adress;
    }
}
