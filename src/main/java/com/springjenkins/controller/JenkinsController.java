package com.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	@GetMapping("/getMessages From Jenkins")
	public String getMessage()
	{
		return "Hi I am From Jenkins Deploy Prjoect ";
	}

}
