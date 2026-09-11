package com.example.CWHWSPRINGBOOT.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.CWHWSPRINGBOOT.Models.Students;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class HWDAY4 {
	@GetMapping("/allstudent")
	public String Students(Model model) {
		List<Students>students=new ArrayList<>();
		students.add(new Students(101,"Anjali Sharma",94.6f));
		students.add(new Students(102,"Rohit Mehta",87.6f));
		students.add(new Students(103,"Sneha Iyer",78.6f));
		model.addAttribute("students",students);
		return "day4hw";
		
	}
	@GetMapping("/singlestudent")
	public String Student(Model model) {
		List<Students>student=new ArrayList<>();
		student.add(new Students(101,"Anjali Sharma",94.6f));
		student.add(new Students(102,"Rohit Mehta",87.6f));
		student.add(new Students(103,"Sneha Iyer",78.6f));
		model.addAttribute("student",student);
		return "day4hwsingle";
		
	}

}
