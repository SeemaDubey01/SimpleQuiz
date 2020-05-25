package com.simple.pkg.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import com.simple.pkg.DTO.DeQuizMaster;
import com.simple.pkg.repo.DeQuizMasterDBRepo;


public class DeQuizMasterDAO {
	@Autowired
	DeQuizMaster deQuizMaster;
	@Autowired
	DeQuizMasterDBRepo deQuizMasterDBRepo;
	
	public Integer nextQustionNo () {
		deQuizMaster.setDeqmQuestionNo(deQuizMaster.getDeqmQuestionNo() + 1);
		deQuizMaster.setDeqmQuestion(" ");
		deQuizMaster.setDeqmOption_a(" "); 
		deQuizMaster.setDeqmOption_b(" ");
		deQuizMaster.setDeqmOption_c(" ");
		deQuizMaster.setDeqmOption_d(" ");
		deQuizMaster.setDeqmAnswer(" ");
		return deQuizMaster.getDeqmQuestionNo();
	}
	
	public boolean save() {
		try {
			deQuizMasterDBRepo.save(deQuizMaster);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
