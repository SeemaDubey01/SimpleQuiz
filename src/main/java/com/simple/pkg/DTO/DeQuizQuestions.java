package com.simple.pkg.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DeQuizQuestions {
	@Id
	private Integer dqsQuestionId;
	private Integer dqsQuestionNo;
	private String dqsQuestion;
	private String dqsOption_a;
	private String dqsOption_b;
	private String dqsOption_c;
	private String dqsOption_d;
	private String dqsAnswer;
	
	@ManyToOne
	@JoinColumn(name="dqQuizId")
	private DeQuizQuiz dequizquiz;

	
	
	public DeQuizQuestions() {
		//super();
	}

	public DeQuizQuestions(DeQuizQuiz deQuizQuiz) {
		super();
		this.dequizquiz = deQuizQuiz;
	}
	
	public Integer getDqsQuestionId() {
		return dqsQuestionId;
	}
	public void setDqsQuestionId(Integer dqsQuestionId) {
		this.dqsQuestionId = dqsQuestionId;
	}
	public void setDqsQuestionId(Integer quizId, Integer questionNo) {
		this.dqsQuestionId = ( quizId * 100 ) + questionNo;
	}
	public Integer getDqsQuestionNo() {
		return dqsQuestionNo;
	}
	public void setDqsQuestionNo(Integer dqsQuestionNo) {
		this.dqsQuestionNo = dqsQuestionNo;
	}
	public String getDqsQuestion() {
		return dqsQuestion;
	}
	public void setDqsQuestion(String dqsQuestion) {
		this.dqsQuestion = dqsQuestion;
	}
	public String getDqsOption_a() {
		return dqsOption_a;
	}
	public void setDqsOption_a(String dqsOption_a) {
		this.dqsOption_a = dqsOption_a;
	}
	public String getDqsOption_b() {
		return dqsOption_b;
	}
	public void setDqsOption_b(String dqsOption_b) {
		this.dqsOption_b = dqsOption_b;
	}
	public String getDqsOption_c() {
		return dqsOption_c;
	}
	public void setDqsOption_c(String dqsOption_c) {
		this.dqsOption_c = dqsOption_c;
	}
	public String getDqsOption_d() {
		return dqsOption_d;
	}
	public void setDqsOption_d(String dqsOption_d) {
		this.dqsOption_d = dqsOption_d;
	}
	public String getDqsAnswer() {
		return dqsAnswer;
	}
	public void setDqsAnswer(String dqsAnswer) {
		this.dqsAnswer = dqsAnswer;
	}
	public DeQuizQuiz getDequizquiz() {
		return dequizquiz;
	}
	public void setDequizquiz(DeQuizQuiz dequizquiz) {
		this.dequizquiz = dequizquiz;
	}

	@Override
	public String toString() {
		
		return "id:"+dqsQuestionId+" Q:"+dqsQuestion+"quiz:"+dequizquiz.getDqQuizId();
	}
	
}
