package com.intuit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloController {

	//http://localhost:8080/greet
	@GetMapping("/greet")
	@ResponseBody
	public String greet() {
		return "Hello";
	}
	
	//http://localhost:8080/bye/Sam
	@GetMapping("/bye/{name}")
	@ResponseBody
	public String sayBye(@PathVariable("name") String name) {
		return "Bye Bye " + name;
	}
	
	//http://localhost:8080/thank?name=Ram
	//curl -XPOST 'http://localhost:8080/thank?name=Ram'
	@PostMapping("/thank")
	@ResponseBody
	public String beGrateful(@RequestParam("name") String name) {
		return "Thank you " + name;
	}
	
}









