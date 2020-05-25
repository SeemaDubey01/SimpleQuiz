package com.simple.pkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.simple.pkg.DTO.DeQuizMaster;
import com.simple.pkg.repo.DeQuizMasterDBRepo;

@Controller
public class DeQuizQMController {
	@Autowired
	DeQuizMasterDBRepo dequizMasterrepo;
	
	@GetMapping("/createquiz")
	private String CrateQuiz(@ModelAttribute("quizmaster") DeQuizMaster quizmaster, Model model) {
		if (quizmaster.getDeqmQuizId() == null ) {
			quizmaster.setDeqmQuizId(105);
			quizmaster.setDeqmQuestionNo(1);
		} 
		model.addAttribute("quizmaster", quizmaster);
		return "createquiz";
	}

	@PostMapping("/createquizstatus")
	private String CreateQuizStatus(@ModelAttribute("quizmaster") DeQuizMaster quizmaster, Model model) {
	
// insert the quiz into DeQuizMaster table
		dequizMasterrepo.save(quizmaster);
		quizmaster.nextQustionNo();

		System.out.println("outside create status: " + quizmaster);
		model.addAttribute("quizmaster", quizmaster);
		return "createquizstatus";
	}

}
