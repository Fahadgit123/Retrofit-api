package com.example.toshiba.retrofitapi;

/**
 * Created by Toshiba on 24-Sep-19.
 */

public class Hero {
    private String name;
    private String realname;
    private String team;
    private String firstapparance;
    private String createdby;
    private String publisher;
    private String imageurl;
    private String bio;

    public Hero(String name, String realname, String team, String firstapparance, String createdby, String publisher,String imageurl, String bio){
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstapparance = firstapparance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }
    public String getName(){
        return name;
    }
    public String getRealname(){
        return realname;
    }
    public String getTeam(){
        return team;
    }
    public String getFirstapparance(){
        return firstapparance;
    }
    public String getCreatedby(){
        return createdby;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getImageurl(){
        return imageurl;
    }
    public String getBio(){
        return bio;
    }
}
