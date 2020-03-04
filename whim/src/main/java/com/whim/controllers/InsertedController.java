package com.whim.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whim.models.FactoryModel;

@Controller
@RequestMapping("/inserted")
public class InsertedController {
	
	@GetMapping()
	public String inserted(@ModelAttribute FactoryModel factorymodel) {
		return "inserted";
	}
	
	@PostMapping("/home")
	public String home() {
		return "home";
	}
}
