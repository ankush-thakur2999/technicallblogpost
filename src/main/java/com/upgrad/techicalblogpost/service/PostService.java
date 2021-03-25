package com.upgrad.com.techicalblogpost.service;

import com.upgrad.com.techicalblogpost.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        Post p1 = new Post();
        p1.setTitle("yolo");
        p1.setBody("lage ppade hai");
        p1.setDate(new Date());
        posts.add(p1);
        return posts;
    }
}
