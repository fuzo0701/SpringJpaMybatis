package com.oppo.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oppo.demo.model.Post;
import com.oppo.demo.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    //"" 으로 처리하여도 됨
    @GetMapping("/list")
    public List<Post> postListS() {
       return postService.postList();
    }


    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId) {
        return new Post(UUID.randomUUID(), "title1", "contents1","", LocalDateTime.now());
    }


}
