package com.therealdanvega.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.therealdanvega.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    // Find the latest blog post to display on the home page.
    Post findFirstByOrderByPostedOnDesc();
}