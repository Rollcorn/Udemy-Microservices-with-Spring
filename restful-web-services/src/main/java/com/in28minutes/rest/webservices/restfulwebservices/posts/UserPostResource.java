package com.in28minutes.rest.webservices.restfulwebservices.posts;

import com.in28minutes.rest.webservices.restfulwebservices.exeption.UserNotFoundException;
import com.in28minutes.rest.webservices.restfulwebservices.user.User;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserPostResource {

    @Autowired
    private UserPostDaoServices service;

    @GetMapping("/users/{id}/posts")
    public List<Post> retrieveAllUserPosts() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public Post retrieveUser(@PathVariable int id) {
        Post post = service.findOne(id);

        if(post==null)
            throw new UserNotFoundException("id-"+ id);

        return post;
    }


    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody Post post) {
        Post savedUserPost = service.save(post);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUserPost.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
