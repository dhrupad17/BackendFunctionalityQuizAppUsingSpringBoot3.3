package com.dhruv.QuizApp.service;

import com.dhruv.QuizApp.model.Question;
import com.dhruv.QuizApp.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public ResponseEntity<List<Question>> getAllQuestions(){
        try{
            return new ResponseEntity<>(questionRepo.findAll(), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionByCategory(String category){
        try{
            return new ResponseEntity<>(questionRepo.findByCategory(category),HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
        try {
            questionRepo.save(question);
            return new ResponseEntity<>("Added New Question Successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed to Add Question", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateQuestion(Integer id, Question updatedQuestion) {
        try {
            if (questionRepo.existsById(id)) {
                updatedQuestion.setId(id);
                questionRepo.save(updatedQuestion);
                return new ResponseEntity<>("Question Updated Successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Question Not Found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed to Update Question", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteQuestion(Integer id) {
        try {
            if (questionRepo.existsById(id)) {
                questionRepo.deleteById(id);
                return new ResponseEntity<>("Question Deleted Successfully", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Question Not Found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed to Delete Question", HttpStatus.BAD_REQUEST);
    }
}
