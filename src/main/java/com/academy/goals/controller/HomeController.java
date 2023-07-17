package com.academy.goals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.academy.goals.model.Post;
import com.academy.goals.service.PostServiceImpl;

@Controller
public class HomeController {

	@RequestMapping("/posts")
	public ModelAndView showMessage() {
		PostServiceImpl postService = new PostServiceImpl();
		List<Post> posts = postService.getPosts();
		ModelAndView mv = new ModelAndView("posts");
		mv.addObject("posts", posts);
		return mv;
	}
}