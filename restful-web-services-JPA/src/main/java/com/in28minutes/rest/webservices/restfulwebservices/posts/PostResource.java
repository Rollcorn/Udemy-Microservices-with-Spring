package com.in28minutes.rest.webservices.restfulwebservices.posts;

import com.in28minutes.rest.webservices.restfulwebservices.exeption.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class PostResource {

    @Autowired
    private PostDaoService service;

    @GetMapping("/users/{idUser}/posts")
    public List<Post> retrieveAllUserPosts(@PathVariable int idUser) {
        return service.findAll(idUser);
    }

    @GetMapping("/users/{id}/posts/{post_id}")
    public Post retrieveUserPosts(@PathVariable int id, @PathVariable int post_id) {
        Post post = service.findOne(id, post_id);

        if(post==null)
            throw new UserNotFoundException("User id: "+ id + ", post id: " + post_id);

        return post;
    }

    @PostMapping("/users/{id}/posts")
    public ResponseEntity<Object> createPost( @PathVariable int id , @RequestBody Post post) {
        Post savedUserPost = service.save(id, post);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{post_id}")
                .buildAndExpand(savedUserPost.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
