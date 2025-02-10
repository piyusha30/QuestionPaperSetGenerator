package com.mini_project.question_setter.services;

import com.mini_project.question_setter.entity.q_bank;

import java.util.List;
import java.util.Set;

public interface Q_bankService {
    public q_bank createQuestion(q_bank qBank) throws Exception;
    public List<q_bank> getQuestions(String subject, int level, int marks,int num) ;
}
