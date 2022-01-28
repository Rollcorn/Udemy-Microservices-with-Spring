package com.in28minutes.rest.webservices.restfulwebservices.posts;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;

public class Post {
    private Integer id;
    private Integer userId;
    private String data;


    public Post() {
    }

    public Post(Integer id, Integer user, String data) {
        this.id = id;
        this.userId = user;
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

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", User=" + userId +
                ", data='" + data + '\'' +
                '}';
    }
}
