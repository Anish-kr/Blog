package com.project.springboot.BlogApp.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlogPost {

	@Id
	@GeneratedValue
	private Long BlogId;
	
	private String BlogPostTitle;
	private String BlogPostdata;
	private LocalDateTime time;
	
	
	
}
