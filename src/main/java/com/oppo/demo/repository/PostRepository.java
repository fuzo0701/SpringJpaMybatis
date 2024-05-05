package com.oppo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oppo.demo.model.Post;

import java.util.List;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {

    List<Post> findByTitle(String title);
    List<Post> findByTitleContains(String title);
    // query creation
    
    // jpql
}
