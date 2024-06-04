package com.example.Quizproject.service;

import com.example.Quizproject.entitis.Quiz;
import java.util.List;

public interface QuizService {

     Quiz add(Quiz quiz);

     List<Quiz> get();

     Quiz getbyId(Long id);

}
