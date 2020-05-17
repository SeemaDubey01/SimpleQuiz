package com.simple.simple;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserDetail {
	@Id
	
	private Integer quizId;
	private String userName;
	
	public Integer getQuizId() {
		return quizId;
	}
	public void setQuizId(Integer quizId) {
		this.quizId = quizId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "quizId = " + quizId + " userName: " + userName;
	}
	
		
}
