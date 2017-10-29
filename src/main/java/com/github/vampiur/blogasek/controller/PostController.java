package com.github.vampiur.blogasek.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.vampiur.blogasek.dao.PostRepository;
import com.github.vampiur.blogasek.domain.Post;
import com.github.vampiur.blogasek.utils.UrlUtils;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostRepository posts;

	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		return new ModelAndView("post_add");
	}
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam(name = "post_title", required = true) String title,
			@RequestParam(name = "post_text", required = true) String text) {

		Post newPost = new Post();
		newPost.text = text;
		newPost.title = title;
		newPost.timestamp = LocalDateTime.now();
		posts.save(newPost);
		return UrlUtils.redirectToOwn("post/show/" + newPost.getId());
	}

	@RequestMapping("/list")
	public ModelAndView list() {
		final ModelAndView modelAndView = new ModelAndView("post_list");
		modelAndView.addObject("posts", posts.findAll());
		return modelAndView;
	}

	// TODO: add redirect to 404 on not found post
	@RequestMapping("/show/{id}")
	public ModelAndView show(@PathVariable long id) {
		final ModelAndView modelAndView = new ModelAndView("post_show");
		if (posts.exists(id)) {
			modelAndView.addObject("post", posts.findOne(id));
		}
		return modelAndView;
	}
}
