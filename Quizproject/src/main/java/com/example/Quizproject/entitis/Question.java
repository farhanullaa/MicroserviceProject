package com.example.Quizproject.entitis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private Long questionid;

    private String question;

    private Long quizId;
}

