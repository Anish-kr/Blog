package Config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Models.Post;
import Services.PostService;

@Component
public class SeedData implements CommandLineRunner{
	
	@Autowired
	private PostService postService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Post> posts=postService.getAll();
		
		if(posts.size()==0) {
		
		
			Post post1=new Post();
			post1.setTitle("Title of Post 1");
			post1.setBody("Body of Post 1");
			
			Post post2=new Post();
			post2.setTitle("Title of Post 2");
			post2.setBody("Body of Post 2");
			
			postService.save(post1);
			postService.save(post2);
			
		}
			
	
	}
	

	
}