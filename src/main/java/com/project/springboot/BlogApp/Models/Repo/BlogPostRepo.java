package com.project.springboot.BlogApp.Models.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.BlogApp.Models.BlogPost;

@Repository
public interface BlogPostRepo extends JpaRepository<BlogPost,Long> {	
	
}
