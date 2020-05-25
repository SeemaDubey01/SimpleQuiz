package com.simple.pkg.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeQuizMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer deqmSrNbr;
	private Integer deqmQuizId;
	private Integer deqmQuestionNo;
	private String deqmQuestion;
	private String deqmOption_a;
	private String deqmOption_b;
	private String deqmOption_c;
	private String deqmOption_d; 
	private String deqmAnswer;

	//@OneToMany
	//@JoinColumn(referencedColumnName="dequizuserlist_dquUserId")
	//private List<DeQuizUser> dequizuserlist;
	
	public Integer getDeqmSrNbr() {
		return deqmSrNbr;
	}
	public void setDeqmSrNbr(Integer deqmSrNbr) {
		this.deqmSrNbr = deqmSrNbr;
	}
	public Integer getDeqmQuizId() {
		return deqmQuizId;
	}
	public void setDeqmQuizId(Integer deqmQuizId) {
		this.deqmQuizId = deqmQuizId;
	}
	public Integer getDeqmQuestionNo() {
		return deqmQuestionNo;
	}
	public void setDeqmQuestionNo(Integer deqmQuestionNo) {
		this.deqmQuestionNo = deqmQuestionNo;
	}
	public String getDeqmQuestion() {
		return deqmQuestion;
	}
	public void setDeqmQuestion(String deqmQuestion) {
		this.deqmQuestion = deqmQuestion;
	}
	public String getDeqmOption_a() {
		return deqmOption_a;
	}
	public void setDeqmOption_a(String deqmOption_a) {
		this.deqmOption_a = deqmOption_a;
	}
	public String getDeqmOption_b() {
		return deqmOption_b;
	}
	public void setDeqmOption_b(String deqmOption_b) {
		this.deqmOption_b = deqmOption_b;
	}
	public String getDeqmOption_c() {
		return deqmOption_c;
	}
	public void setDeqmOption_c(String deqmOption_c) {
		this.deqmOption_c = deqmOption_c;
	}
	public String getDeqmOption_d() {
		return deqmOption_d;
	}
	public void setDeqmOption_d(String deqmOption_d) {
		this.deqmOption_d = deqmOption_d;
	}
	public String getDeqmAnswer() {
		return deqmAnswer;
	}
	public void setDeqmAnswer(String deqmAnswer) {
		this.deqmAnswer = deqmAnswer;
	}
	

	@Override
	public String toString() {
		return "quidId: " + deqmQuizId + " question#: " + deqmQuestionNo + 
				" question: " + deqmQuestion + 
				" a: " + deqmOption_a + " b: " + deqmOption_b + " c: " + deqmOption_c
				+ " d: " + deqmOption_d + " ans: " + deqmAnswer ;
	}
	public Integer nextQustionNo () {
		deqmQuestionNo = deqmQuestionNo + 1;
		deqmQuestion = " ";
		deqmOption_a = " ";
		deqmOption_b = " ";
		deqmOption_c = " ";
		deqmOption_d = " ";
		deqmAnswer = " ";
		return deqmQuestionNo;
	}
}

