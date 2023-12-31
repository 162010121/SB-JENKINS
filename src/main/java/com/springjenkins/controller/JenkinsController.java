package com.springjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/emp")

public class JenkinsController {

	@GetMapping("/getMessage")
    public String get()

	{

		return "Message From Spring-Jenkins ";
	}

}
