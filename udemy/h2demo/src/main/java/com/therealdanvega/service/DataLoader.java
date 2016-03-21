package com.therealdanvega.service;

import com.therealdanvega.domain.Author;
import com.therealdanvega.domain.Post;
import com.therealdanvega.repository.AuthorRepository;
import com.therealdanvega.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DataLoader {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    private void loadData() {
        // Create an author.
        Author dv = new Author("Steve", "Smith");
        authorRepository.save(dv);

        // Create a post.
        Post post = new Post("Spring Data Rocks!!!");
        post.setBody("Post Body here!!!");
        post.setPostedOn(new Date());
        post.setAuthor(dv);
        postRepository.save(post);
    }
}
