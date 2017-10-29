package com.github.vampiur.blogasek.utils;

import org.springframework.web.servlet.ModelAndView;

/**
 * Helper methods for generating urls
 * @author Pawel
 *
 */
public class UrlUtils {
	public static ModelAndView redirectToOwn(String url) {
		return new ModelAndView("redirect:/"+url);
	}
}
