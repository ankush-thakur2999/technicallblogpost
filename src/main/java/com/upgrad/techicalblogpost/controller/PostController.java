package com.upgrad.com.techicalblogpost.controller;

import com.upgrad.com.techicalblogpost.model.Post;
import com.upgrad.com.techicalblogpost.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PostController {
    private PostService postService = new PostService();
    @RequestMapping("/posts")
    public String getUserPost(Model model) {
        ArrayList<Post> POSTS = postService.getAllPosts();
        model.addAttribute("posts", POSTS);
        return ("/posts");

    }
}
