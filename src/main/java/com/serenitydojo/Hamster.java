package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteWheel;

    public Hamster(String name, int age, String favoriteWheel) {
        super(name, age);
        this.favoriteWheel = favoriteWheel;
    }

    public String getFavoriteWheel() {
        return favoriteWheel;
    }

    public void setFavoriteWheel(String favoriteWheel) {
        this.favoriteWheel = favoriteWheel;
    }

    @Override
    public String play() {
        return "runs in " + favoriteWheel;
    }
}
