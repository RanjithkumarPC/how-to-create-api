package com.upgrad.upstac.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.upgrad.upstac.entity.Demo;
import com.upgrad.upstac.service.DemoService;

@RestController 
public class UpStacLoginController {
	
	@Autowired
	DemoService service;
	
	@RequestMapping(method=RequestMethod.GET, path="login/{id}")
	public String loginA(@PathVariable int id) {
		String response = service.findById(id);
		if(response != null) {
			return "welcome " + response;
		}
		return "welcome ";
	}
	
	@PostMapping(value="persist/user")
	public void anotherLogin(@RequestBody Demo demo) {
		service.save(demo);
	}
}
