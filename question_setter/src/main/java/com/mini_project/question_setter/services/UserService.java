package com.mini_project.question_setter.services;

import com.mini_project.question_setter.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public User  createUser(User user) throws Exception;
    public User getUser(String username) ;
}
