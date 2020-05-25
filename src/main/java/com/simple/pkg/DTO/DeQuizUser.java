package com.simple.pkg.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DeQuizUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer dquUserId;
	private Integer dquQuizId;
	private String dquUserName;
	private String dquSessionId;
	private Integer dquMarks;
	private String dquAnswer;
	private Integer dquTotalMarks;
	
	//@ManyToOne
	//private DeQuizMaster dequizmaster;
	
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
	public String getDquAnswer() {
		return dquAnswer;
	}
	public void setDquAnswer(String dquAnswer) {
		this.dquAnswer = dquAnswer;
	}
	public Integer getDquTotalMarks() {
		return dquTotalMarks;
	}
	public void setDquTotalMarks(Integer dquTotalMarks) {
		this.dquTotalMarks = dquTotalMarks;
	}

	@Override
	public String toString() {
		return "userId = " + dquUserId + "quizId: " + dquQuizId + " userName: " + dquUserName + " session id: " + dquSessionId + " marks: " + dquMarks ;
	}
	
		
}
