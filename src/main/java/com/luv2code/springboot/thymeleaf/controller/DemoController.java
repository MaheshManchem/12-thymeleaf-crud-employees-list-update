package com.luv2code.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	//create a mapping for "/hello"
	@GetMapping("/hello")
	public String sayhello(Model theModel) {
		theModel.addAttribute("theDate",new java.util.Date());
		return "helloworld";
	
	//here helloworld in return statement is helloworld present in the templetes and look for helloworld.html as thymeleaf is added
	//in the dependencies. 	
	}
}
