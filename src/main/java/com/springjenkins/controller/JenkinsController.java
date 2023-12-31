package com.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenk")
public class JenkinsController {
	
	@GetMapping("/getMessages")
	public String getMessage()
	{
		return "Hi I am From Jenkins Deploy Prjoect";
	}

}
