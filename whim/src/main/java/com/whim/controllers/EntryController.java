package com.whim.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whim.models.FactoryModel;

@Controller
@RequestMapping("/entry")
public class EntryController {
	@GetMapping()
	public String entry(Model model) {
		model.addAttribute("factorymodel", new FactoryModel(0, 0, null, null, 0, null));
		return "entry";
	}
	
	@PostMapping("/inserted")
	public String inserted(@ModelAttribute FactoryModel factorymodel) {
		return "inserted";
	}
	
	@PostMapping("/home")
	public String home() {
		return "home";
	}
}
