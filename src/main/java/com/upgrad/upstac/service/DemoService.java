package com.upgrad.upstac.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upgrad.upstac.entity.Demo;
import com.upgrad.upstac.repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	DemoRepository repo;

	public String findById(int id) {
		return repo.getData(id);
	}
	
	public void save(Demo d) {
		repo.save(d);
	}

}
