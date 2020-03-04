package com.whim.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whim.models.FactoryModel;

@Controller
@RequestMapping({"/","/home"})
public class HomeController {
	
	@GetMapping()
	public String home() {
		return "home";
	}
	
	@PostMapping("/entry")
	public String entry(Model model) {
		model.addAttribute("factorymodel", new FactoryModel(0, 0, null, null, 0, null));
		return "entry";
	}
	
	@PostMapping("/categories")
	public String categories() {
		return "categories";
	}
	
}
