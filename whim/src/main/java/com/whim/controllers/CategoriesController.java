package com.whim.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class CategoriesController {
	
	@GetMapping()
	public String categories() {
		return "categories";
	}
	
	@PostMapping("/sent")
	public String sent() {
		return "sent";
	}
	@PostMapping("/received")
	public String received() {
		return "received";
	}
	@PostMapping("/damaged")
	public String damaged() {
		return "damaged";
	}
	
}
