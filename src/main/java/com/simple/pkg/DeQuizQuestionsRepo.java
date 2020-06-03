package com.simple.pkg;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simple.pkg.DTO.DeQuizQuestions;


public interface DeQuizQuestionsRepo extends JpaRepository <DeQuizQuestions, Integer>{

}
