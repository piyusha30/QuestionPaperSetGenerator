package com.mini_project.question_setter;

import com.mini_project.question_setter.entity.User;
import com.mini_project.question_setter.entity.q_bank;
import com.mini_project.question_setter.services.Q_bankService;
import com.mini_project.question_setter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mini_project.question_setter"})
public class QuestionSetterApplication  implements CommandLineRunner {
    @Autowired
	private UserService userService ;
    @Autowired
	private Q_bankService q_bankService;

	public static void main(String[] args) {
		SpringApplication.run(QuestionSetterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("start");

		/*q_bank que= new q_bank();
		que.setqType();
		user.setPassword("123");
		User user1=this.userService.createUser(user);
		System.out.println(user1.getUsername());
*/
	}
}
