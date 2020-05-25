package com.simple.pkg.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.simple.pkg.DTO.DeQuizQuiz;
import com.simple.pkg.repo.DeQuizQuizRepo;

@Component
public class DeQuizQuizDAO {

	@Autowired
	DeQuizQuizRepo deQuizQuizRepo;
	
	public boolean save (DeQuizQuiz deQuizQuiz) {
		try {
			deQuizQuizRepo.save(deQuizQuiz);
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}
}
