package com.github.vampiur.blogasek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.vampiur.blogasek.dao.PostRepository;
import com.github.vampiur.blogasek.domain.Post;

@Controller("/post")
public class PostController {
	
	@Autowired
	PostRepository posts;
	
	
	@RequestMapping(path="/add")
	public ModelAndView add(
			@RequestParam( name="post_title", required=true)String title,
			@RequestParam(name="post_text", required=true)String text) {

		Post newPost=new Post();
		posts.save(newPost);
		
		return new ModelAndView("post_show","post",newPost);
	}
}
