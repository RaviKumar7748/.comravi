package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Std {
	@GetMapping("/name")
	public String data() {
		return "jii";
	}

	

}
