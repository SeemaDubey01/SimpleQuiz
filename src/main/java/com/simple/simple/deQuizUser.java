package com.simple.simple;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class deQuizUser {
	@Id
	
	private Integer dquUserId;
	private Integer dquQuizId;
	private String dquUserName;
	private String dquSessionId;
	private Integer dquMarks;
	
	public Integer getDquUserId() {
		return dquUserId;
	}

	public void setDquUserId(Integer dquUserId) {
		this.dquUserId = dquUserId;
	}

	public Integer getDquQuizId() {
		return dquQuizId;
	}

	public void setDquQuizId(Integer dquQuizId) {
		this.dquQuizId = dquQuizId;
	}

	public String getDquUserName() {
		return dquUserName;
	}

	public void setDquUserName(String dquUserName) {
		this.dquUserName = dquUserName;
	}

	public String getDquSessionId() {
		return dquSessionId;
	}

	public void setDquSessionId(String dquSessionId) {
		this.dquSessionId = dquSessionId;
	}

	public Integer getDquMarks() {
		return dquMarks;
	}

	public void setDquMarks(Integer dquMarks) {
		this.dquMarks = dquMarks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "userId = " + dquUserId + "quizId: " + dquQuizId + " userName: " + dquUserName + " session id: " + dquSessionId + " marks: " + dquMarks ;
	}
	
		
}
