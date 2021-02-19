package com.helloworld.example.helloworldexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {

	@RequestMapping("/hello")
	public String helloworld()
	{
		return "Hello World!";
	}
}
