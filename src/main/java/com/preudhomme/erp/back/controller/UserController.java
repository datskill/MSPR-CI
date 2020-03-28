package com.preudhomme.erp.back.controller;

import com.preudhomme.erp.back.entity.User;
import com.preudhomme.erp.back.exception.UserException;
import com.preudhomme.erp.back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> all () {
        return userRepository.findAll ();
    }

    @GetMapping("/user/{id}")
    public User one(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserException (id.toString ()));
    }
}