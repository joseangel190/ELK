package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping
    List<User> findAll(){
        logger.info("Listando Usuarios");
        return userRepository.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        userRepository.deleteById(id);
    }

}
