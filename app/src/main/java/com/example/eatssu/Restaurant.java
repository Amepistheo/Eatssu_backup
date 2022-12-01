package com.example.eatssu;

public class Restaurant {
    private String mdate;
    private String mrestaurant_time;
    private String mmenu;


    public Restaurant() {}

    public Restaurant(String date, String restaurant_time, String menu) {
        mdate = date;
        mrestaurant_time = restaurant_time;
        mmenu = menu;
    }

    public String getTime() {
        return mrestaurant_time;
    }

    public void setTime(String time) {
        this.mrestaurant_time = time;
    }

    public String getDate() {
        return mdate;
    }

    public void setDate(String date) {
        this.mdate = date;
    }

    public String getMenu() {
        return mmenu;
    }

    public void setMenu(String menu) {
        this.mmenu = menu;
    }
}
