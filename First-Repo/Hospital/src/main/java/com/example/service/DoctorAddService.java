package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.DoctorAdd;
import com.example.repository.DoctorAddRepository;


@Service
public class DoctorAddService {

	@Autowired
	private DoctorAddRepository docRe;
	
	 public List<DoctorAdd> listAll() {
	        return docRe.findAll();
	    }
	     
	    public void save(DoctorAdd doctoradd) {
	    	docRe.save(doctoradd);
	    }
	     
	    public DoctorAdd get(int id) {
	        return docRe.findById(id).get();
	    }
	     
	    public void delete(int id) {
	    	docRe.deleteById(id);
	    }
	    public DoctorAdd updatedoctorAdd(DoctorAdd doctorAdd) {
	    	return this.docRe.save(updatedoctorAdd(doctorAdd));

	    	}
	
}