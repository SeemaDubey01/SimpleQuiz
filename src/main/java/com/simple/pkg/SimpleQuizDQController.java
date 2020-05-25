package com.simple.pkg;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
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
	DeQuizMasterDBRepo dequizMasterrepo;
	@Autowired
	DeQuizUserDBRepo userRepo;
	
	@GetMapping("/register")
	private String showForm(Model model) {
		System.out.println("inside register ");
		DeQuizUser user = new DeQuizUser();
		model.addAttribute("user", user);
		
		return "register";
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") DeQuizUser user,
					Model model) {
		user.setDquSessionId("dummy session manish test");
		user.setDquAnswer("x");
		user.setDquMarks(0); 
		user.setDquMarks(0);
		System.out.println("inside register post: " + user);
		model.addAttribute("user",user);
	//	userRepo.save(user);
		return "registerok";
	}
	
	@GetMapping("/startquiz")
	private String showQuiz(@ModelAttribute("user") DeQuizUser user,Model model) {
		System.out.println("inside startquiz get: " + user);
		List<DeQuizMaster> qlist = new ArrayList<DeQuizMaster>();
		qlist = dequizMasterrepo.findAll();
		
		DeQuizMaster dquizMaster = qlist.get(1);
		model.addAttribute("dquizMaster",dquizMaster);
		return "startquiz";
	}
	
	@PostMapping("/startquiz")
	private String showQuizPost(@ModelAttribute("user") DeQuizUser user,Model model) {
		System.out.println("inside startquiz post: " + user);
		List<DeQuizMaster> qlist = new ArrayList<DeQuizMaster>();
		qlist = dequizMasterrepo.findAll();
		
		DeQuizMaster dquizMaster = qlist.get(1);
		model.addAttribute("dquizMaster",dquizMaster);
		return "startquiz";
	}
	
	@PostMapping("/showResult")
	private String showResult(@ModelAttribute("dquizMaster") DeQuizMaster dquizMaster,HttpSession session, Model model,
			@ModelAttribute("user") DeQuizUser user) {
		System.out.println("inside startquiz post: " + user);
		
		return "showresult";
	}
}


