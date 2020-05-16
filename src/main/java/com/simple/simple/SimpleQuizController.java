package com.simple.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleQuizController {

	@RequestMapping("/")
	public String index() {
	System.out.println("inside index");
	
	return "index";
	}
}
