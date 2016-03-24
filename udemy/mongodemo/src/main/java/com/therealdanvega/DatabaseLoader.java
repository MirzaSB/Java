package com.therealdanvega;


import com.therealdanvega.domain.Author;
import com.therealdanvega.domain.Post;
import com.therealdanvega.repository.AuthorRepository;
import com.therealdanvega.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DatabaseLoader {

    private static final Logger logger = LoggerFactory.getLogger(MongodbDemoApplication.class);
    private final PostRepository postRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public DatabaseLoader(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    private void initDatabase() {

        authorRepository.deleteAll();

        Author js = new Author();
        js.setFirstName("John");
        js.setLastName("Smith");
        js.setEmail("jsmithnbcu@gmail.com");
        authorRepository.save(js);

        postRepository.deleteAll();

        Post post = new Post();
        post.setTitle("Spring Data Rocks!!");
        post.setSlug("spring-data-rocks from slug");
        post.setTeaser("Post Teaser");
        post.setBody("Post Body");
        post.setPostedOn(new Date());
        post.setAuthor(js);
        postRepository.save(post);

        js.getPosts().add(post);
        authorRepository.save(js);
    }
}
