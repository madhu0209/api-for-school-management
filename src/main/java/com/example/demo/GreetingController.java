package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/student/")
public class GreetingController {

	@Value("${app.name:Default Demo App}")
	private String appName;

	@GetMapping("/get")
	//@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Greeting getStudent () {
		Greeting studentResponse = new Greeting(1, "John", "Smith");
		return studentResponse;
	}
}