package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.PathologyAdd;
import com.example.repository.PathologyAddRepository;



@Service
public class PathologyAddService {

	@Autowired
	private PathologyAddRepository pathRe;

	public List<PathologyAdd> listAll() {
		return pathRe.findAll();
	}

	public void save(PathologyAdd pathologyadd) {
		pathRe.save(pathologyadd);
	}

	public PathologyAdd get(int id) {
		return pathRe.findById(id).get();
	}

	public void delete(int id) {
		pathRe.deleteById(id);
	}

}
