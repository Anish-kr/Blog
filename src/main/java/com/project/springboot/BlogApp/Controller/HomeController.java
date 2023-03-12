package com.project.springboot.BlogApp.Controller;
import org.springframework.ui.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.BlogApp.Models.BlogPost;
import com.project.springboot.BlogApp.Models.service.BlogService;

@Controller
public class HomeController {
	
	@Autowired
	private BlogService postservice;
	
	@GetMapping("/")
	public String home(Model model) {
		List<BlogPost> posts= postservice.getAll();
		model.addAttribute("posts", posts);
		return "home";
	}
	

	
}
