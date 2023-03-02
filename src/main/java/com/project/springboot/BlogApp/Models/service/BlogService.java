package com.project.springboot.BlogApp.Models.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot.BlogApp.Models.BlogPost;
import com.project.springboot.BlogApp.Models.Repo.BlogPostRepo;

@Service
public class BlogService {

	@Autowired
	private BlogPostRepo blogrepo;
	
	public List<BlogPost> getAll()
		{
			return blogrepo.findAll();
		}
	
	
	public Optional<BlogPost> findById(long id)
	{
		return blogrepo.findById(id); 
		
	}
	
	public void savePost(BlogPost apost)
	{
		if(apost.getBlogId()==null)
		{
			apost.setTime(LocalDateTime.now());
		}
		blogrepo.save(apost);
	}
}
