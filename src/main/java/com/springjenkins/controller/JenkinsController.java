package com.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping("/ From Jenkins")

	public String get()

	{

		return "Message From Spring-Jenkins ";
	}

}
