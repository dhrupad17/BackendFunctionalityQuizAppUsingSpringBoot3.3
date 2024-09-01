package com.dhruv.QuizApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.stream.LongStream;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questions;

}
