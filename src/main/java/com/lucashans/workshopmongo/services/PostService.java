package com.lucashans.workshopmongo.services;

import com.lucashans.workshopmongo.domain.Post;
import com.lucashans.workshopmongo.domain.User;
import com.lucashans.workshopmongo.repositories.PostRepository;
import com.lucashans.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
