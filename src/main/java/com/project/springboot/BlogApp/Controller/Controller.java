package com.project.springboot.BlogApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.BlogApp.Models.BlogPost;
import com.project.springboot.BlogApp.Models.service.BlogService;

@RestController
public class Controller {
	
	@Autowired
	private BlogService service;
	
	@GetMapping("/postlist")
	public List<BlogPost> getAll(){
		return service.getAll();		
	}
	
	

	
}
