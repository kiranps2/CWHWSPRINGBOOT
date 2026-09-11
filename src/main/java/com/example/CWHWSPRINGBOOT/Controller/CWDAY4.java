package com.example.CWHWSPRINGBOOT.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.CWHWSPRINGBOOT.Models.Product;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class CWDAY4 {
@GetMapping("/fullpage")
public String Products(Model model) {
	List<Product> products=new ArrayList<>();
	products.add(new Product(1,"maggi",34.5f));
	products.add(new Product(2, "Chocolate",(float) 67.78));
    products.add(new Product(3, "Chips",(float) 90.89));
    model.addAttribute("products", products);
    return "day4cw";
}

@GetMapping("/singlepage")
public String Product(Model model) {
	List<Product> singleproducts=new ArrayList<>();
	singleproducts.add(new Product(1,"maggi",34.5f));
	singleproducts.add(new Product(2, "Chocolate",(float) 67.78));
	singleproducts.add(new Product(3, "Chips",(float) 90.89));
    model.addAttribute("singleproducts", singleproducts);
    return "day4cw2single";
}
}
