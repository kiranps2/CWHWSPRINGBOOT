package com.example.CWHWSPRINGBOOT.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class CWDAY3 {
	@GetMapping("/cw3")
    public String cw3(Model model) {
        String message = "Hello from Spring Boot!";
        model.addAttribute("message", message);
        String hello = "<h1>Hello, World!</h1>";
        model.addAttribute("hello", hello);
        boolean isLoggedIn = true;
        model.addAttribute("isLoggedIn", isLoggedIn);
        return "day3";
    }
}

