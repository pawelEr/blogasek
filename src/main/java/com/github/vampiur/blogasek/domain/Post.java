package com.github.vampiur.blogasek.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public String title;
	
	public String text;
	
	public Date timestamp;
}
