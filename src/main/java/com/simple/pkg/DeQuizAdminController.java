package com.simple.pkg;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.simple.pkg.SQevent.DeQuizAdminPublisher;

@Controller
public class DeQuizAdminController {
	@Autowired
	DeQuizAdminPublisher deQuizAdminPublisher;
	
	@GetMapping("/publisher")
	private String startPublishing(Model model) {
		String message;
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		message = "Publishing time:" + timestamp;
		if (deQuizAdminPublisher.getAdminEmitter() == null) {
			deQuizAdminPublisher.registerAdmin();
		}
		model.addAttribute("message", message);
		return "publisher";
	}
	
	@GetMapping("/publisherevent")
	public SseEmitter publisherevent() {
		if (deQuizAdminPublisher.getAdminEmitter() == null) {
			deQuizAdminPublisher.registerAdmin();
		}
		return deQuizAdminPublisher.getAdminEmitter();
	}
	

	@GetMapping("/listener")
	public String startListening(@ModelAttribute("message") String message, Model model) {
		System.out.println("inside listening controller ");
		
		return "listener";
	}
}
