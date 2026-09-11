package com.example.CWHWSPRINGBOOT.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class HWDAY3 {
	@GetMapping("/hw3")
	public String hw3(Model model) {
        String movie = "godzilla";
        model.addAttribute("message", movie);
        String discription = "Godzilla is a gigantic prehistoric creature and one of the most famous monsters in popular culture. Often portrayed as a massive, dinosaur-like reptile, Godzilla is known for his enormous size, incredible strength, tough, nearly indestructible body, and devastating atomic breath.";
        model.addAttribute("discription", discription);
        boolean isLoggedIn = false;
        model.addAttribute("isLoggedIn", isLoggedIn);
        return "day3hw";
    }
}
