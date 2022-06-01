package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.TestAppointment;


@Repository
public interface TestAppointmentRepository extends JpaRepository<TestAppointment, Integer>{

	String addTestDetails(TestAppointment testappointment);

	boolean deleteAllById(TestAppointment testappointment);

}
