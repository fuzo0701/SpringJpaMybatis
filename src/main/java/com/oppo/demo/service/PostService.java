package com.oppo.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oppo.demo.model.Post;
import com.oppo.demo.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    //private final PostMapper postMapper;

    public List<Post> postList() {
        return postRepository.findAll();
        
    }

}
