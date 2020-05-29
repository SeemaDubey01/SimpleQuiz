package com.simple.pkg;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.simple.pkg.SQevent.DeQuizEventPublisher;

@Controller
public class SimpleQuizEventController {
	@Autowired
	DeQuizEventPublisher deQuizEventPublisher;
	
	@GetMapping("/publisher")
	private String startPublishing(Model model) {
		String message;
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		message = "Publishing time:" + timestamp;
		model.addAttribute("message", message);
		deQuizEventPublisher.publishMessage(message);
		return "publisher";
	}

	@GetMapping("/listener")
	public String startListening(@ModelAttribute("message") String message, Model model) {
		System.out.println("inside listening controller ");
		
		return "listener";
	}
}
