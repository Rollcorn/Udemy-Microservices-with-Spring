package com.in28minutes.rest.webservices.restfulwebservices.posts;

import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class PostDaoService {
    private static Map<Integer, List<Post>> userPosts = new TreeMap<>();


    public Post save(Integer userId, Post post) {

        if (userPosts.get(userId) == null) {
            userPosts.put(userId, new ArrayList<Post>());
            post.setId(1);
        } else {

            post.setId( userPosts.get(userId).size() + 1);
        }
        post.setUserId(userId);
        userPosts.get(userId).add(post);
        return post;
    }

    public List<Post> findAll(Integer userId) {
        return userPosts.get(userId);
    }

    public Post findOne(int userId, int postId) {
        Post res = null;
        if (userPosts.get(userId) != null && userPosts.get(userId).get(postId) != null) {
            res = userPosts.get(userId).get(postId);
        }
        return res;
    }

}
