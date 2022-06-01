package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.DoctorAdd;
import com.example.repository.DoctorAddRepository;

@RestController
public class DoctorController {
	@Autowired
	private DoctorAddRepository doctre;
	@PostMapping("/doctor")
	public DoctorAdd save(@RequestBody DoctorAdd doctoradd) {
		return this.doctre.save(doctoradd);
		
	}
	
	
	@DeleteMapping("/doctor/doctoradd/{id}")
	public void delete(@PathVariable(name = "id")int id) {
		this.doctre.deleteById(id);
	}
	@GetMapping("DoctorAdd")
	public String DoctorAdd(DoctorAdd doctorAdd) {
		return this.DoctorAdd(doctorAdd);
		
	}
	@PutMapping("/update")
	public Object DoctorAdd1 (@RequestBody DoctorAdd doctoradd ) {
		return this.doctre.updatedoctoradd(doctoradd);
		}
}


