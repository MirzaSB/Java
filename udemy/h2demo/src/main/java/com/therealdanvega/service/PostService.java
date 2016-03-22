package com.therealdanvega.service;

import com.therealdanvega.domain.Post;
import com.therealdanvega.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getLatestPost() {
        return postRepository.findFirstByOrderByPostedOnDesc();
    }
}
