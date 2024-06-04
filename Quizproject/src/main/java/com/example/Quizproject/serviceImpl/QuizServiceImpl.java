package com.example.Quizproject.serviceImpl;

import com.example.Quizproject.entitis.Quiz;
import com.example.Quizproject.repository.QuizRepository;
import com.example.Quizproject.service.QuestionClient;
import com.example.Quizproject.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {

        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List <Quiz> quizzes = quizRepository.findAll();
        List<Quiz> newQuizList= quizzes.stream().map( quiz -> {
            quiz.setQuestion(questionClient.getQuestionOfQuiz(quiz.getId()));
               return quiz;
                }).collect(Collectors.toList());
        return newQuizList;
    }

    @Override
    public Quiz getbyId(Long id) {

        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("NEW quiz exception"));
        quiz.setQuestion(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }

}
