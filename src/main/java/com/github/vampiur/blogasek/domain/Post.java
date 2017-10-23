package com.github.vampiur.blogasek.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public String title;
	
	@Lob
	public String text;
	
	public LocalDateTime timestamp;
	
	@ManyToMany
	public List<Category> categories;

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}

	public long getId() {
		return id;
	}
	
	
}
