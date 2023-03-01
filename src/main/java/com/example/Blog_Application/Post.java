package com.example.Blog_Application;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String title;
	
	@Column(columnDefinition ="TEXT")
	private String body;
	
	private LocalDateTime createdAt;
	
}

/*
@Getter and @Setter are annotations provided by Lombok library that generate Java code to automatically generate getters and setters for the fields of a class.
@Getter annotation generates the getter method for each non-static field of the class. The getter method has the same name as the field and returns the value of the field.
@Setter annotation generates the setter method for each non-static field of the class. The setter method has the same name as the field and takes a single parameter that is used to set the value of the field.
*/