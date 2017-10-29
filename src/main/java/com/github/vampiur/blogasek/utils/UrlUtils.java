package com.github.vampiur.blogasek.utils;

import org.springframework.web.servlet.ModelAndView;

public class UrlUtils {
	public static ModelAndView redirectTo(String url) {
		return new ModelAndView("redirect:"+url);
	}
}
