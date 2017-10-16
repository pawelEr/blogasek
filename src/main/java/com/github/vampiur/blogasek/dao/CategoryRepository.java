package com.github.vampiur.blogasek.dao;

import org.springframework.data.repository.CrudRepository;

import com.github.vampiur.blogasek.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
