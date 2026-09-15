package com.example.CWHWSPRINGBOOT.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CWDAY6 {
	@GetMapping("/form")
	public String processform() {
		
		return "username";
	}
	
	
	@GetMapping("/welcome")
	public String processform(@RequestParam(required=false) String username,Model model) {
		model.addAttribute("username",username);
		return "welcome";
	}
}
