package com.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.model.Patient;

@Repository
public interface Patientrepo extends JpaRepository<Patient, Long>{
	
}
