package com.academy.goals.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.academy.goals.model.Post;
import com.academy.goals.repository.PostRepository;
import com.academy.goals.repository.PostRepositoryImpl;

@Service
public class PostServiceImpl implements PostService {
	// storing data temporary…
	List<Post> list;

	@Override
	public List<Post> getPosts() {
		PostRepository postRepository = new PostRepositoryImpl();
		this.list = postRepository.addPosts();
		return list;
	}
}