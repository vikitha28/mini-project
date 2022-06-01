package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.PatientAppointment;
import com.example.repository.PatientAppointmentRepository;


@Service
public class PatientAppointmentService {

	@Autowired
	private PatientAppointmentRepository patientRe;
	
    public List<PatientAppointment> listAll() {
        return patientRe.findAll();
    }
}