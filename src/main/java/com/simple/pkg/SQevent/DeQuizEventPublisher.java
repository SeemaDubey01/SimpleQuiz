package com.simple.pkg.SQevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class DeQuizEventPublisher {

	@Autowired
	private ApplicationEventPublisher deQuizPublisher;
	
	public void publishMessage(String message) {
		System.out.println("Inside publish");
		
		DeQuizEvent deQuizEvent = new DeQuizEvent(this, message);
		deQuizPublisher.publishEvent(deQuizEvent);
	}

}
