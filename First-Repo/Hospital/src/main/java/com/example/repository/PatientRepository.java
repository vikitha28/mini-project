package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Patient;



public interface PatientRepository extends JpaRepository<Patient, Integer> {

	
}
