package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.TestAppointment;
import com.example.repository.TestAppointmentRepository;



@RestController

public class TestAppointmentController {

	@Autowired
	private TestAppointmentRepository testRe;
	
	@GetMapping("/pathologyTest")
	public String test(TestAppointment testappointment){
		
		return this.testSave(testappointment);
	}
	
	@PostMapping("/test")
	public String testSave(@RequestBody TestAppointment testappointment){
		
		return this.testRe.addTestDetails(testappointment);
	}
	@DeleteMapping("/user/testappointment/{id}")
	public void deleteAppointment(@PathVariable(name = "id") int id) {
	this.testRe.deleteById(id);
	

}
}
