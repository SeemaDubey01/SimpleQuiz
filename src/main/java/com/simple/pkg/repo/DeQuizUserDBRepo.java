package com.simple.pkg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simple.pkg.DTO.DeQuizUser;

public interface DeQuizUserDBRepo extends JpaRepository <DeQuizUser, Integer>{

}
