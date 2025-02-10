package com.mini_project.question_setter.controller;

import com.mini_project.question_setter.entity.User;
import com.mini_project.question_setter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;
    //create user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
return this.userService.createUser(user);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
return this.userService.getUser(username);
    }
}
