package com.simple.pkg.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeQuizTest {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer dqtSr;
	private Integer dqtQuizNo;
	private String dqtUserName;
	private Integer dqtMarks;
	
	public Integer getDqtSr() {
		return dqtSr;
	}
	public void setDqtSr(Integer dqtSr) {
		this.dqtSr = dqtSr;
	}
	public Integer getDqtQuizNo() {
		return dqtQuizNo;
	}
	public void setDqtQuizNo(Integer dqtQuizNo) {
		this.dqtQuizNo = dqtQuizNo;
	}
	public String getDqtUserName() {
		return dqtUserName;
	}
	public void setDqtUserName(String dqtUserName) {
		this.dqtUserName = dqtUserName;
	}
	public Integer getDqtMarks() {
		return dqtMarks;
	}
	public void setDqtMarks(Integer dqtMarks) {
		this.dqtMarks = dqtMarks;
	}

	@Override
	public String toString() {
		return "quizNo: " + dqtQuizNo + " name: " + dqtUserName + " marks: " + dqtMarks;
	}
	
	
}
