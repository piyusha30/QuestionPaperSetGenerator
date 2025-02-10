package com.mini_project.question_setter.services.implement;

import com.mini_project.question_setter.entity.User;
import com.mini_project.question_setter.repo.UserRepository;
import com.mini_project.question_setter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements UserService{
    @Autowired
    private UserRepository userRepository;
//creating user
    @Override
    public User createUser(User user) throws Exception {
        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null) {
            System.out.println("User is already there !!");
            throw new Exception ("User already present !!");
        } else {
//user create
            local=this.userRepository.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }
}
