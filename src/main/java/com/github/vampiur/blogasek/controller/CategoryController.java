package com.github.vampiur.blogasek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.vampiur.blogasek.dao.CategoryRepository;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryRepository categories;

	@RequestMapping(path="/add", method=RequestMethod.GET)
	public ModelAndView add() {
		return new ModelAndView("category_add");
	}
	
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public ModelAndView add(@RequestParam(name="category_name", required=true) String name) {
		return new ModelAndView();
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		final ModelAndView modelAndView=new ModelAndView("category_list");
		modelAndView.addObject("categories", categories.findAll());
		return modelAndView;
	}
}
