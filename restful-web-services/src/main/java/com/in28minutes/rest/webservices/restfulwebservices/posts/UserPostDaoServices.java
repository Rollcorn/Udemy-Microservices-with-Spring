package com.in28minutes.rest.webservices.restfulwebservices.posts;

import java.util.ArrayList;
import java.util.List;


//
public class UserPostDaoServices {
    private static ArrayList<ArrayList<Post>> userPosts = new ArrayList<>();

    public ArrayList<Post> findAllUserPosts(Integer userId) {
        return userPosts.get(userId);
    }

    private static int postsCount = 3;

    static {
        ArrayList<Post> user1 = new ArrayList<>();
        user1.add(1, new Post(1, 1, "hello" );
        userPosts.add(1, user1 );
//        userPosts.add(new Post(2, 2, "Am i Jack?"));
//        userPosts.add(new Post(3, 2, "Oh no!"));
    }
//TODO
    public Post save(Integer userId, Post post) {
        if ( userPosts.get(userId) == null) {
            userPosts.get(userId) = new ArrayList<>();
        }
        userPosts.get(userId).add(post);
    }

    public Post findOne(int id) {
        for (Post user : userPosts) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

}
