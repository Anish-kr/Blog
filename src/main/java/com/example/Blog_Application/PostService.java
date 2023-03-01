package com.example.Blog_Application;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service

public class PostService {

	@Autowired
	private PostRepository postrepository;

	public Optional<Post> getById(Long Id)
	{
		return postrepository.findById(Id);
	}
	
	
	public List<Post> getAll()
		{
			return postrepository.findAll();
		}
	
	
	
	public Post save(Post post)
		{
		if(post.getId()==null)
			{post.setCreatedAt(LocalDateTime.now());}
			
		return postrepository.save(post); 	
		}
	
}
