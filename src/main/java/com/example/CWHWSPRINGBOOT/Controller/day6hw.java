package com.example.CWHWSPRINGBOOT.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;
import com.example.CWHWSPRINGBOOT.Models.*;

@Controller
public class day6hw {
	@GetMapping("/register")
	public String showForm(Registration registration) {
	   
	    
	    return "day6hw";
	}

	 @PostMapping("/submit")
	    public String submitForm(@Valid @ModelAttribute("userDetails") Registration registration, BindingResult result, Model model) {
	        model.addAttribute("registration", registration);
	        if (result.hasErrors()) {
	            return "day6hw";
	        } else {
	            return "success";
	        }
	    }

}
