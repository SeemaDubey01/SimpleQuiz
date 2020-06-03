package com.simple.pkg.SQevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DeQuizEventListener implements ApplicationListener <DeQuizEvent> {


	@Override
	public void onApplicationEvent(DeQuizEvent deQuizEvent) {
		System.out.println("inside listener: " + deQuizEvent.getMessage());
	
	}
}
