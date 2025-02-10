package com.mini_project.question_setter.controller;

import com.mini_project.question_setter.entity.User;
import com.mini_project.question_setter.entity.q_bank;
import com.mini_project.question_setter.services.Q_bankService;
import com.mini_project.question_setter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/qbank")
@CrossOrigin("*")
public class Q_bankController {
    @Autowired
    private Q_bankService q_bankService;
    //create question
    @PostMapping("/")
    public q_bank createQuestion(@RequestBody q_bank qBank) throws Exception{
return this.q_bankService.createQuestion(qBank);
    }
    @GetMapping("/{subject}/{level}/{marks}/{num}")
    public List<q_bank> getQuestions(@PathVariable("subject") String subject, @PathVariable("level") int level, @PathVariable("marks") int marks,@PathVariable("num") int num)  {
return this.q_bankService.getQuestions(subject,level,marks,num);
    }
}

