package com.in28minutes.rest.webservices.restfulwebservices.posts;

public class Post {
    private Integer id;
    private Integer userId;


    public Post() {
    }

    public Post(Integer id, Integer userId, String data) {
        this.id = id;
        this.userId = userId;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;
}
