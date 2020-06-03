package com.simple.pkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.simple.pkg.DTO.DeQuizUser;
import com.simple.pkg.SQevent.DeQuizAdminPublisher;

@Controller
public class DeQuizMPController {

	@Autowired
	DeQuizAdminPublisher deQuizAdminPublisher;
	
	@GetMapping("/registerquiz2")
	private String CrateQuiz(@ModelAttribute("deQuizUser") DeQuizUser deQuizUser, Model model) {
		model.addAttribute("deQuizUser", deQuizUser);
		return "registerquiz2";
	}
	
	@PostMapping("/startquiz2")
	private String StartQuiz2(@ModelAttribute("deQuizUser") DeQuizUser deQuizUser, Model model) {
		System.out.println("registered: " + deQuizUser);
		deQuizAdminPublisher.registerParticipant(deQuizUser);
		
		return "startquiz2";
	}
	
}
