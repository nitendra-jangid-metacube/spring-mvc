package com.academy.goals.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.academy.goals.model.Post;

@Service
public class PostRepositoryImpl implements PostRepository {
	// storing data temporary…
	List<Post> list;

	// adding constructor of List<Post>
	public PostRepositoryImpl() {
		// adding data into this constructor.
		list = new ArrayList<>();
		list.add(new Post(1, "Har Ghar Tiranga campaign",
				"Epost Office National Flag: How to buy Tricolour online to participate in Har Ghar Tiranga campaign"));
		list.add(new Post(2, "Post office scheme",
				"Know the minimum balance needed in savings account, interest rate, deposit, withdrawal limits, other details you cannot miss"));
	}

	@Override
	public List<Post> addPosts() {
		// TODO Auto-generated method stub
		return list;
	}
}