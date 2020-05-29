package com.simple.pkg.SQevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.simple.pkg.SimpleQuizEventController;

@Component
public class DeQuizEventListener implements ApplicationListener <DeQuizEvent> {

	@Autowired 
	SimpleQuizEventController simpleQuizEventController;
	
	@Override
	public void onApplicationEvent(DeQuizEvent deQuizEvent) {
		System.out.println("inside listener: " + deQuizEvent.getMessage());
				
		//simpleQuizEventController.startListening(deQuizEvent.getMessage());
	}
}
