package com.simple.pkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.simple.pkg.DAO.DeQuizQuestionDAO;
import com.simple.pkg.DAO.DeQuizQuizDAO;
import com.simple.pkg.DTO.DeQuizQuestions;
import com.simple.pkg.DTO.DeQuizQuiz;

@Controller
public class DeQuizCreateControllerV2 {

	@Autowired
	DeQuizQuizDAO deQuizQuizDAO;
	@Autowired
	DeQuizQuestionDAO deQuizQuestionDAO;
	
	@GetMapping("/createquizv2")
	private String CrateQuiz(@ModelAttribute("deQuizQuiz") DeQuizQuiz deQuizQuiz, Model model) {
		model.addAttribute("deQuizQuiz", deQuizQuiz);
		return "createquizv2";
	}
	
	@PostMapping("/writequiz")
	private String WriteQuiz(@ModelAttribute("deQuizQuiz") DeQuizQuiz deQuizQuiz, Model model) {
	// write the record into DeQuizQuiz
		deQuizQuizDAO.save(deQuizQuiz);
		System.out.println("inside writequiz the model is"+model);
		System.out.println("initialzing question table the model 4646456464is"+model);
		
		DeQuizQuestions deQuizQuestions = new DeQuizQuestions(deQuizQuiz);
		System.out.println("objedt question:  " + deQuizQuestions);
		deQuizQuestionDAO.initQuestions(deQuizQuestions);
		
		System.out.println("sending question to next page"+deQuizQuestions);
		model.addAttribute("deQuizQuestions", deQuizQuestions);
		System.out.println("initialzing question table the model new is7997979797979797"+model);
		return "createquestionv2";
	}
	
	@PostMapping("/createconfirm")
	private String CrateConfirm(@ModelAttribute("deQuizQuestions") DeQuizQuestions deQuizQuestions, Model model) {
	// write question table	deQuizQuestions
		deQuizQuestionDAO.save(deQuizQuestions);
		
		//model.addAttribute("deQuizQuestions", deQuizQuestions);
		
		//System.out.println("inside create confirm model object is----------" + model);
		return "createconfirm";
	}
	
	@GetMapping("createquestionv2")
	private String CrateQuestionv2(@ModelAttribute("deQuizQuestions") DeQuizQuestions deQuizQuestions, Model model) {
		// write question table	deQuizQuestions
			deQuizQuestionDAO.nextQuestion(deQuizQuestions);
			return "createquestionv2";
	}
	
	@GetMapping("searchquestion")
	public String SearchQuestion(@ModelAttribute("deQuizQuestions") DeQuizQuestions deQuizQuestions, Model model) {
		return "searchquestion";
	}

	@PostMapping("/displayquestion")
	private String DisplayQuestion(@ModelAttribute("deQuizQuestions") DeQuizQuestions deQuizQuestions, Model model) {
		deQuizQuestions = deQuizQuestionDAO.findQuestion(deQuizQuestions);
		model.addAttribute("deQuizQuestions", deQuizQuestions);
		System.out.println ("Search question: " + deQuizQuestions);
		return "displayquestion";
	}
}

