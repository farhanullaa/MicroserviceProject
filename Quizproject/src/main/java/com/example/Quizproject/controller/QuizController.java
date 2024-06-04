package com.example.Quizproject.controller;


import com.example.Quizproject.entitis.Quiz;
import com.example.Quizproject.service.QuizService;
import com.example.Quizproject.serviceImpl.QuizServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz Create(@RequestBody Quiz quiz)
    {
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> getAlldetials()
    {
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getiddetails(@PathVariable Long id)
    {
        return quizService.getbyId(id);
    }

}
