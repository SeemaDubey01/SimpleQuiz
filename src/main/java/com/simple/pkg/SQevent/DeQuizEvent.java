package com.simple.pkg.SQevent;

import org.springframework.context.ApplicationEvent;

public class DeQuizEvent extends ApplicationEvent{
	
	private String message;
	
	public DeQuizEvent(Object source, String message ) {
		super(source);
		this.message = message;
	}
	
	public String getMessage () {
		return message;
	}
}
