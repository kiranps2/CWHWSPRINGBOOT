package com.example.CWHWSPRINGBOOT.Controller;
import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller

public class HWday5 {
	@GetMapping("/book")
	public String book(Model model) {
		String mssg="welcomes to book page";
		model.addAttribute("mssg",mssg);
		String author="benyamin";
		model.addAttribute("author",author);
		String title="goat life";
		model.addAttribute("title",title);
		float price=150;
		model.addAttribute("price",price);
		return "bookhw5";
	}
	@GetMapping("/home")
	public String home(Model model) {
		String mssghome="welcomes to home page";
		model.addAttribute("mssghome",mssghome);
		
		return "homeday5";
	}

}
