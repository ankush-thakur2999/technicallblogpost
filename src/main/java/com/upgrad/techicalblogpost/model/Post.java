package com.upgrad.com.techicalblogpost.model;

import java.util.Date;

public class Post {
    private String title ;
    private  String body;
    private Date date;

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
