package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bean.PatientAppointment;
import com.example.repository.PatientAppointmentRepository;



@Controller
public class PatientAppointmentController {

	@Autowired
	private PatientAppointmentRepository patientRe;
	
	@GetMapping("/patientappointment")
	public String appointment(Model model){
		model.addAttribute("patientappointment", new PatientAppointment());
		return "patientappointment";
	}
	
	@PostMapping("/patienthome")
	public String appointmentSave(PatientAppointment patientappointment){
		patientRe.save(patientappointment);
		return "patienthome";
	}
}
