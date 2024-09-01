package com.dhruv.QuizApp.service;

import com.dhruv.QuizApp.model.Question;
import com.dhruv.QuizApp.model.QuestionWrapper;
import com.dhruv.QuizApp.model.Quiz;
import com.dhruv.QuizApp.model.Response;
import com.dhruv.QuizApp.repo.QuestionRepo;
import com.dhruv.QuizApp.repo.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepo quizRepo;

    @Autowired
    private QuestionRepo questionRepo;

    public ResponseEntity<String> createQuiz(String category,int numQ,String title){

        List<Question> questions=questionRepo.findRandomQuestionsByCategory(category,numQ);

        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepo.save(quiz);

        return new ResponseEntity<>("Successfully created Quiz :"+quiz.getTitle(), HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id){
        Optional<Quiz> quiz=quizRepo.findById(id);
        List<Question> questionsFromDB=quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser=new ArrayList<>();
        for(Question q: questionsFromDB){
            QuestionWrapper qw=new QuestionWrapper(q.getId(),q.getQuestiontitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
            questionsForUser.add(qw);
        }

        return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
    }


    public ResponseEntity<String> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        List<Question> questions = quiz.getQuestions();
        int rightAns = 0;
        int countQuestions = 0;

        for (Response res : responses) {
            if (res.getResponse().equals(questions.get(countQuestions).getRightanswer())) {
                rightAns++;
            }
            countQuestions++;
        }

        // Calculate the accuracy percentage
        double accuracyPercentage = ((double) rightAns / questions.size()) * 100;

        // Create the result message
        String resultMessage = String.format("You have Successfully completed the quiz with %.2f%% accuracy", accuracyPercentage);

        return new ResponseEntity<>(resultMessage, HttpStatus.OK);
    }


}
