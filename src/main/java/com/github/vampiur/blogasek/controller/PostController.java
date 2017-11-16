package com.github.vampiur.blogasek.controller;

import com.github.vampiur.blogasek.dao.PostRepository;
import com.github.vampiur.blogasek.domain.Post;
import com.github.vampiur.blogasek.utils.Code404Exception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/post")
public class PostController {

    private PostRepository posts;

	@Autowired
    public PostController(PostRepository posts) {
        this.posts = posts;
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public Post add(@RequestParam(name = "post_data") Post postData) {

        postData.timestamp = LocalDateTime.now();
        posts.save(postData);
        return postData;
    }

    @RequestMapping(path = "/", method = RequestMethod.PUT)
    public Post edit(@RequestParam(name = "post_data") Post postData) {
        if (posts.exists(postData.id)) {
            posts.save(postData);
        } else {
            postData.timestamp = LocalDateTime.now();
            posts.save(postData);
        }
        return postData;
    }


    @GetMapping(value = "/")
    public Iterable<Post> list() {
        return posts.findAll();
    }


    @GetMapping(value = "/{id}")
    public Post show(@PathVariable long id) {
        if (posts.exists(id)) {
            return posts.findOne(id);
        } else {
            throw new Code404Exception("Post not found");
        }
	}
}
