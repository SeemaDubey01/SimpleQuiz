package com.simple.simple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleQuizController {

	@RequestMapping("/")
	public String index() {
	System.out.println("inside index");
	
	return "index";
	}
	
	@Autowired
	SimpleQuizDBRepo userRepo;
	@RequestMapping("/dbresult")
	public String dbresult(Model model) {
		System.out.println("inside dbresult");
		List<UserDetail> list = new ArrayList<UserDetail>();
		list = userRepo.findAll();
		model.addAttribute("list", list);
		System.out.println("Size of the list is "+list.size());
		System.out.println("First element of the list is ---->>>"+list.get(0).toString());
		System.out.println("Second element of the list is ---->>>"+list.get(1).toString());
		System.out.println("Third element of the list is ---->>>"+list.get(2));
		
		return "dbresult";
	}
}
