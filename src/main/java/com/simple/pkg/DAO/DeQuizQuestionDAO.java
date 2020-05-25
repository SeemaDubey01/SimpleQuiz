package com.simple.pkg.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.simple.pkg.DTO.DeQuizQuestions;
import com.simple.pkg.repo.DeQuizQuestionsRepo;

@Component
public class DeQuizQuestionDAO {
	@Autowired
	DeQuizQuestionsRepo deQuizQuestionsRepo;
	
	public boolean save (DeQuizQuestions deQuizQuestions) {
		try {
			deQuizQuestionsRepo.save(deQuizQuestions);
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public void initQuestions (DeQuizQuestions deQuizQuestions) {
		System.out.println("Initializing");
		deQuizQuestions.setDqsQuestionId(deQuizQuestions.getDequizquiz().getDqQuizId(), 1);
		deQuizQuestions.setDqsQuestionNo(1);
		deQuizQuestions.setDqsQuestion(" ");
		deQuizQuestions.setDqsOption_a(" ");
		deQuizQuestions.setDqsOption_b(" ");
		deQuizQuestions.setDqsOption_c(" ");
		deQuizQuestions.setDqsOption_d(" ");
		deQuizQuestions.setDqsAnswer(" ");
	}

	public void nextQuestion(DeQuizQuestions deQuizQuestions) {
		deQuizQuestions.setDqsQuestionNo(deQuizQuestions.getDqsQuestionNo()+1);
		deQuizQuestions.setDqsQuestionId(deQuizQuestions.getDequizquiz().getDqQuizId(), deQuizQuestions.getDqsQuestionNo());
	}

	public DeQuizQuestions findQuestion(DeQuizQuestions deQuizQuestions) {
		deQuizQuestions.setDqsQuestionId(deQuizQuestions.getDequizquiz().getDqQuizId(), deQuizQuestions.getDqsQuestionNo());
		DeQuizQuestions deQuizQuestions2 = new DeQuizQuestions();
		Optional<DeQuizQuestions> dequestionMap = deQuizQuestionsRepo.findById(deQuizQuestions.getDqsQuestionId());
		if (dequestionMap.isPresent()){
			deQuizQuestions2 =dequestionMap.get();
		}
		
		System.out.println("find bty id: "+ deQuizQuestions2);
		return deQuizQuestions2;
	}

}
