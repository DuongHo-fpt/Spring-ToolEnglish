package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

	@GetMapping(value = {"/", "home"})
	public String login1() {
		return "homePages";
	}
	
	
}
