package com.example.spring.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetMVCController {
	
	@GetMapping("/greetMe")
	public String greeting(@RequestParam(name="userName", required=false, defaultValue="World") String userName,Model model) {

		// Business logic here...
		//http://localhost:8071/greetMe?userName=Hani%20R

		model.addAttribute("name", userName);
		
		return "hello";
	}
}