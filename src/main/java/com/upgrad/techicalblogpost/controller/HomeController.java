package com.upgrad.com.techicalblogpost.controller;

import com.upgrad.com.techicalblogpost.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
@Controller
public class HomeController {
    @RequestMapping("/getallposts")
    public String getAllPosts(Model model){
        ArrayList<Post> posts = new ArrayList<>();
        Post p1 = new Post();
        p1.setTitle("yolo");
        p1.setBody("lage ppade hai");
        p1.setDate(new Date());

        Post p2 = new Post();
        p2.setTitle("yolo");
        p2.setBody("lage ppade hai");
        p2.setDate(new Date());

        Post p3 = new Post();
        p3.setTitle("yolo");
        p3.setBody("lage ppade hai");
        p3.setDate(new Date());
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        model.addAttribute("posts" ,posts);
        return  "index";
     }
}
