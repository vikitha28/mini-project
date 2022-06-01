package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.TestAppointment;
import com.example.repository.TestAppointmentRepository;


@Service
public class TestAppointmentService {

    @Autowired
	private TestAppointmentRepository testRe;
    
    public TestAppointment addTestDetails(TestAppointment testappointment) {
		return this.testRe.save(testappointment);
    	
    }
	
    public List<TestAppointment> listSave() {
        return testRe.findAll();
    }
    public boolean deleteAppointment(TestAppointment testappointment) {
		boolean result = false;
		try {
			this.testRe.delete(testappointment);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
			// TODO: handle exception
		}
		return result;
	}
}
