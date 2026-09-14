package com.example.CWHWSPRINGBOOT.Controller;
import org.springframework.web.bind.annotation.GetMapping;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class CWDAY5 {
		@GetMapping("/index")
		public String message(Model model) {
			 String message = "Hello from Spring Boot!";
		        model.addAttribute("message", message);
		        return "day5CWindex" ;
		}
//		@GetMapping("/product")
//		public String product() {
//			return "day5cwproduct" ;
//		}
		@GetMapping("/product")
		public String promessage(Model model) {
			 String promessage = "welcome to my product page";
		        model.addAttribute("promessage", promessage);
		        return "day5CWproduct" ;
		}
//	    @GetMapping("/partials")
//	    public String headfooter() {
//	        return "day5CWindex";
//	    }
}
