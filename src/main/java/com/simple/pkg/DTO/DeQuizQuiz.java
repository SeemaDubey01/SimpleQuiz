package com.simple.pkg.DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DeQuizQuiz {
	@Id
	private Integer dqQuizId;
	private String dqQuizDetail;
	
	

	public DeQuizQuiz() {
		super();
	}
	@OneToMany(mappedBy="dequizquiz")
	private List <DeQuizQuestions> dequizQuestions;
	
	public Integer getDqQuizId() {
		return dqQuizId;
	}
	public void setDqQuizId(Integer dqQuizId) {
		this.dqQuizId = dqQuizId;
	}
	public String getDqQuizDetail() {
		return dqQuizDetail;
	}
	public void setDqQuizDetail(String dqQuizDetail) {
		this.dqQuizDetail = dqQuizDetail;
	}
	
}
