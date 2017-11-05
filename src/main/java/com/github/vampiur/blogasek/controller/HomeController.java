package com.github.vampiur.blogasek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.vampiur.blogasek.dao.PostRepository;
import com.github.vampiur.blogasek.domain.Post;

@Controller
public class HomeController {
	
	@Autowired
	private PostRepository posts;
	
	@RequestMapping("/")
	public ModelAndView welcome(){
		Post latestPost = posts.findFirstByOrderByTimestampDesc();
		return new ModelAndView("welcome","latest_post",latestPost);
	}
}
