package com.simple.pkg;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.simple.pkg.DTO.DeQuizMaster;
import com.simple.pkg.DTO.DeQuizTest;
import com.simple.pkg.DTO.DeQuizUser;

@Controller
public class SimpleQuizController {
	@Autowired
	DeQuizMasterDBRepo quizRepo;
	@Autowired
	DeQuizUserDBRepo userRepo;
	@Autowired
	DeQuizTestDBRepo quizTRepo;
	
	@RequestMapping("/")
	public String index(){
		System.out.println("Home page");
		return "index";
	}
	@RequestMapping("/index")
	public String index1() {
		return "index";
	}
	
	@RequestMapping("/dbresult")
	public String dbresult(Model model) {
		System.out.println("inside dbresult");
		List<DeQuizUser> list = new ArrayList<DeQuizUser>();
		list = userRepo.findAll();
		model.addAttribute("list", list);
		System.out.println("Size of the list is "+list.size());
		System.out.println("First element of the list is ---->>>"+list.get(0).toString());
		System.out.println("Second element of the list is ---->>>"+list.get(1).toString());
		System.out.println("Third element of the list is ---->>>"+list.get(2));
		
		return "dbresult";
	}
	

	@RequestMapping("/dbquestion")
	public String dbquestion(Model model) {
		List<DeQuizMaster> qlist = new ArrayList<DeQuizMaster>();
		qlist = quizRepo.findAll();
		model.addAttribute("list", qlist);
		System.out.println("Size of the list is "+ qlist.size());
		System.out.println("First element of the list is ---->>>"+ qlist.get(0).getDeqmQuestion());
		System.out.println("Second element of the list is ---->>>"+ qlist.get(1));
		System.out.println("Third element of the list is ---->>>"+qlist.get(2));
		
		return "dbquestion";
	}

	@RequestMapping("/dbtestresult")
	public String dbtestresult(Model model) {
		List<DeQuizTest> qlist = new ArrayList<DeQuizTest>();
		qlist = quizTRepo.findAll();
		model.addAttribute("list", qlist);
		System.out.println("Size of the list is "+ qlist.size());
		System.out.println("First element of the list is ---->>>"+ qlist.get(0));
		System.out.println("Second element of the list is ---->>>"+ qlist.get(1));
		System.out.println("Third element of the list is ---->>>"+qlist.get(2));
		
		return "dbtestresult";
	}


	@PostMapping("/dbtestresult")
	public String submitForm(@ModelAttribute("dqtest") DeQuizTest dqtest)
	{
		System.out.println("inside dbtestresult"); 
		System.out.println("Entered value is--quiz--"+dqtest);
		
		Instant instant = Instant.now();
		long timeStampMillis = instant.toEpochMilli();
		System.out.println("time is: " + timeStampMillis) ;
		
		//dqTestRepo.save(dqtest);
		return "dbtestresult";
		
	}
		
	@RequestMapping ("/dbtest")
	public String dbtest(Model model) {
		DeQuizTest dqtest = new DeQuizTest();
		Instant instant = Instant.now();
		long timeStampMillis = instant.toEpochMilli();
		model.addAttribute("dqtest", dqtest);
		System.out.println("inside dbtest");
		System.out.println("Entered value is---" + dqtest);
		System.out.println("time is: " + timeStampMillis) ;
		return "dbtest";
	}
}
