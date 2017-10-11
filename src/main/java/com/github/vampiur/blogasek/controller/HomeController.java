package com.github.vampiur.blogasek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView helloWorld(){
		String message="text from model ";
		return new ModelAndView("welcome","message",message);
	}
}
