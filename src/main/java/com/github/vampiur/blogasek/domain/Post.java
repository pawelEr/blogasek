package com.github.vampiur.blogasek.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;

	private String title;
	
	@Lob
	public String text;
	
	public LocalDateTime timestamp;
	
	@ManyToMany
	private List<Category> categories;

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
}
