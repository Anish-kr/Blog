package com.project.springboot.BlogApp.Models.Repo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.springboot.BlogApp.Models.BlogPost;
import com.project.springboot.BlogApp.Models.service.BlogService;

@Component
public class BlogPostSeedData implements CommandLineRunner{

	@Autowired
	private BlogService blogservice;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		List<BlogPost> list=blogservice.getAll();
		
		if(list.size()==0)
		{
			BlogPost newblog1=new BlogPost();
			newblog1.setBlogId((long) 1);
			newblog1.setBlogPostTitle("First title");
			newblog1.setBlogPostdata("I am a happy soul");
			newblog1.setTime(LocalDateTime.now());
			blogservice.savePost(newblog1);
			

		
			newblog1.setBlogId((long) 2);
			newblog1.setBlogPostTitle("Second title");
			newblog1.setBlogPostdata("I am a even more happy soul");
			newblog1.setTime(LocalDateTime.now());
			blogservice.savePost(newblog1);
			
		
			newblog1.setBlogId((long) 3);
			newblog1.setBlogPostTitle("Third title");
			newblog1.setBlogPostdata("I am a very patient man");
			newblog1.setTime(LocalDateTime.now());
			blogservice.savePost(newblog1);
			
		
			newblog1.setBlogId((long) 4);
			newblog1.setBlogPostTitle("Fourth title");
			newblog1.setBlogPostdata("I love loving what i am doing");
			newblog1.setTime(LocalDateTime.now());
			blogservice.savePost(newblog1);
			

			newblog1.setBlogId((long) 5);
			newblog1.setBlogPostTitle("Fifth title");
			newblog1.setBlogPostdata("I love mySelf");
			newblog1.setTime(LocalDateTime.now());
			blogservice.savePost(newblog1);
			
		}
	
	
	}
	
}
