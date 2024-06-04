package com.example.Quizproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizprojectApplication.class, args);

		System.out.println("hello");
	}


}
