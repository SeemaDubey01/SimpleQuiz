package com.simple.pkg;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simple.pkg.DTO.DeQuizMaster;

public interface DeQuizMasterDBRepo extends JpaRepository <DeQuizMaster, Integer>{

}
