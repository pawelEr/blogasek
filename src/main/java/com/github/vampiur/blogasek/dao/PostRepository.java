package com.github.vampiur.blogasek.dao;

import com.github.vampiur.blogasek.domain.Category;
import com.github.vampiur.blogasek.domain.Post;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
	List<Post> findByCategories(List<Category> categories);
	Post findOneByOrderByTimestampDesc();
}
