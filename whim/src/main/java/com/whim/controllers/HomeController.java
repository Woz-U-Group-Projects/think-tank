package com.whim.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		model.addAttribute("factorymodel", new FactoryModel(null, null, null, null, null, null));
		return "entry";
	}
	
	@PostMapping("/inserted")
	public String inserted(@ModelAttribute FactoryModel factorymodel, Model model) {
		model.addAttribute("factorymodel", factorymodel);
		return "inserted";
	}
	
	@PostMapping("/home")
	public String back() {
		return "home";
	}
	
	@PostMapping("/categories")
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
