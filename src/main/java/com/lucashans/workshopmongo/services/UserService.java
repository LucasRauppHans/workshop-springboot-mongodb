package com.lucashans.workshopmongo.services;

import com.lucashans.workshopmongo.domain.User;
import com.lucashans.workshopmongo.dto.UserDTO;
import com.lucashans.workshopmongo.repositories.UserRepository;
import com.lucashans.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id){
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj){
        return repository.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());

    }
}
