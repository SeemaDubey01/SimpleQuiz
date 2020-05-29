package com.simple.pkg;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.simple.pkg.DTO.DeQuizMaster;
import com.simple.pkg.DTO.DeQuizUser;
import com.simple.pkg.repo.DeQuizMasterDBRepo;
import com.simple.pkg.repo.DeQuizUserDBRepo;

@Controller
public class SimpleQuizDQController {
	@Autowired
	DeQuizMasterDBRepo deQuizMasterRepo;
	@Autowired
	DeQuizUserDBRepo deQuizUserRepo;
	
	@GetMapping("/register")
	private String showForm(Model model) {
		System.out.println("inside register ");
		DeQuizUser deQuizUser = new DeQuizUser();
		model.addAttribute("deQuizUser", deQuizUser);
		
		return "register";
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute("deQuizUser") DeQuizUser deQuizUser,
					Model model) {
		deQuizUser.setDquSessionId("dummy session manish test");
		deQuizUser.setDquAnswer("x");
		deQuizUser.setDquMarks(0); 
		deQuizUser.setDquMarks(0);
		deQuizUser.setDquQuestionNo(0);
		deQuizUser.setDquTotalMarks(0);
		System.out.println("inside register post: " + deQuizUser);
		model.addAttribute("user",deQuizUser);
		deQuizUserRepo.save(deQuizUser);
		return "registerok";
	}
/* startquiz requires userId, quizId and questionNo*/
	@PostMapping("/startquiz")
	private String showQuiz(@ModelAttribute("deQuizUser") DeQuizUser deQuizUser,Model model) {
		System.out.println("inside startquiz get: " + deQuizUser);
		Integer quizId = deQuizUser.getDquQuizId() * 100 + deQuizUser.getDquQuestionNo() + 1;
		System.out.println("quizid: " + quizId);
		DeQuizMaster deQuizMaster = new DeQuizMaster ();
	
		Optional<DeQuizMaster> deQuizMasterMap = deQuizMasterRepo.findById(quizId);
		if (!deQuizMasterMap.isPresent()){
			return "finalresult";
		}
	
		deQuizMaster = deQuizMasterMap.get();
		deQuizMaster.setDquUserId(deQuizUser.getDquUserId());
		model.addAttribute("deQuizMaster",deQuizMaster);
		System.out.println("going to jsp-startquiz: " + deQuizMaster);
		return "startquiz";
	}
	
/*  showresult needs 4 parameters - quizId, questionNo, answer and userId*/
	@PostMapping("/showresult")
	private String showResult(@ModelAttribute("deQuizMaster") DeQuizMaster deQuizMaster, Model model){
		System.out.println("inside startquiz post: " + deQuizMaster.getDquUserId());
		System.out.println("Correct Ans: " +deQuizMaster.getDeqmAnswer() + " Selected:" + deQuizMaster.getSelectedAnswer());
		
		DeQuizUser deQuizUser = new DeQuizUser();
		Optional<DeQuizUser> deQuizUserMap = deQuizUserRepo.findById(deQuizMaster.getDquUserId());
		if (!deQuizUserMap.isPresent()){
			return "error";
		}
		deQuizUser = deQuizUserMap.get();
		deQuizUser.setDquQuestionNo(deQuizMaster.getDeqmQuestionNo());
		deQuizUser.setDquMarks(0);
		if(deQuizMaster.getDeqmAnswer().equals(deQuizMaster.getSelectedAnswer())) {
			System.out.println("adding marks");
			deQuizUser.setDquMarks(10);
			deQuizUser.setDquTotalMarks(deQuizUser.getDquTotalMarks()+10);
			deQuizUserRepo.save(deQuizUser);	
		}
		model.addAttribute("deQuizUser",deQuizUser);
		return "showresult";
	}
}


