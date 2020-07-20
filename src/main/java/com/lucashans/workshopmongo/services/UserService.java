package com.lucashans.workshopmongo.services;

import com.lucashans.workshopmongo.domain.User;
import com.lucashans.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();

    }
}
