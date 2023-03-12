package com.project.springboot.BlogApp.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.springboot.BlogApp.Models.BlogPost;
import com.project.springboot.BlogApp.Models.service.AccountService;
import com.project.springboot.BlogApp.Models.service.BlogService;

@Controller
public class PostController {


    @Autowired
    private BlogService postService;

    @Autowired
    private AccountService accountService;

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model) {

        // find post by id
        Optional<BlogPost> optionalPost = this.postService.findById(id);

        // if post exists put it in model
        if (optionalPost.isPresent()) {
            BlogPost post = optionalPost.get();
            model.addAttribute("post", post);
            return "post";
        } else {
            return "404";
        }
    }
    
    
    
    @PostMapping("/posts/{id}")
     public String updatePost(@PathVariable Long id, BlogPost post, Model model) {

        Optional<BlogPost> optionalPost = postService.findById(id);
        if (optionalPost.isPresent()) {
            BlogPost existingPost = optionalPost.get();

            existingPost.setBlogPostTitle(post.getBlogPostTitle());
            
            
            existingPost.setBlogPostdata(post.getBlogPostdata());

            postService.savePost(existingPost);
        }

        return "redirect:/posts/" + post.getBlogId();
    }
}
