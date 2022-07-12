package com.laurencetuchin.springbootblogapplication.controllers;

import com.laurencetuchin.springbootblogapplication.models.Post;
import com.laurencetuchin.springbootblogapplication.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        // find the post by id
        Optional<Post> optionalPost = postService.getById(id);
        // if the post exists, put it in the model
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            model.addAttribute("post", post);
            return "posts";
        } else {
            return "404";
        }
    }
}
