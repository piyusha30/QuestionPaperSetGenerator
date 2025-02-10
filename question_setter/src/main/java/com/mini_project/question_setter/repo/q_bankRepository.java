package com.mini_project.question_setter.repo;

import com.mini_project.question_setter.entity.q_bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
@Repository
public interface q_bankRepository extends JpaRepository<q_bank, Integer> {
    @Query(nativeQuery = true,value="select * from q_bank que where que.Subject = :Subject and que.level = :level and que.marks = :marks ORDER BY RAND() limit :num  ")
    public List<q_bank> findQuestions(@Param("Subject") String Subject, @Param("level") int level, @Param("marks") int marks,@Param("num") int num);
}
