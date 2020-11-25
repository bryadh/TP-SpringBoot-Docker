package com.fds.springboot.demo.controllers;

import com.fds.springboot.demo.models.User;
import com.fds.springboot.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> list(){
        return userRepository.findAll();
    }

    @GetMapping
    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public User get(@PathVariable Long id){
        System.out.println("DEBUG ===> user: "+userRepository.getOne(id).toString());
        return userRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody final User user) {
        return userRepository.saveAndFlush(user) ;
    }

}
