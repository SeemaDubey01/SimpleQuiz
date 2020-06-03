package com.simple.pkg.SQevent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.simple.pkg.DTO.DeQuizUser;

@Component
public class DeQuizAdminPublisher {

	private List<SseEmitter> emitters = new ArrayList<SseEmitter> ();
	private SseEmitter adminEmitter;
	
	public void registerParticipant(DeQuizUser deQuizUser) {
		SseEmitter emitter = new SseEmitter ();
		emitters.add(emitter);
		System.out.println("Participant " + deQuizUser.getDquUserName() + " registered");
		try {
			adminEmitter.send(SseEmitter.event().name("registerUser").data(deQuizUser.getDquUserName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void registerAdmin() {
		adminEmitter = new SseEmitter();
		System.out.println("Creating admin Emitter");
		
		adminEmitter.onCompletion(() -> System.out.println("admin emitter closed"));
	}

	public List<SseEmitter> getEmitters() {
		return emitters;
	}

	public void setEmitters(List<SseEmitter> emitters) {
		this.emitters = emitters;
	}

	public SseEmitter getAdminEmitter() {
		return adminEmitter;
	}

	public void setAdminEmitter(SseEmitter adminEmitter) {
		this.adminEmitter = adminEmitter;
	}

	
}
