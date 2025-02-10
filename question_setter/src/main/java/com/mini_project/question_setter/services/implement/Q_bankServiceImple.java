package com.mini_project.question_setter.services.implement;

import com.mini_project.question_setter.entity.q_bank;
import com.mini_project.question_setter.repo.q_bankRepository;
import com.mini_project.question_setter.services.Q_bankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Q_bankServiceImple implements Q_bankService {

@Autowired
private q_bankRepository q_bankRepository;
    @Override
    public q_bank createQuestion(q_bank qBank) throws Exception {
        return this.q_bankRepository.save(qBank);
    }

    @Override
    public List<q_bank> getQuestions(String subject, int level, int marks,int num) {
        List<q_bank> q_banks=this.q_bankRepository.findQuestions(subject,level,marks,num);
      return q_banks;

   }
}

