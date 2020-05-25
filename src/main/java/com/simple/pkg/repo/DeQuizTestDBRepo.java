package com.simple.pkg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simple.pkg.DTO.DeQuizTest;

public interface DeQuizTestDBRepo extends JpaRepository <DeQuizTest, Integer> {

}

