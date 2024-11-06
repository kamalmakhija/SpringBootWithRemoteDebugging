package com.example.SpringBootWithRemoteDebugging.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SampleController {

	@GetMapping
	public String getHello() {
		
		System.out.println("Statement Before First Breakpoint ");
		
		//Place First Breakpoint here.
		System.out.println(" First Breakpoint Passsed ");

		//Place Second Breakpoint here.
		System.out.println(" Second Breakpoint Passsed ");
		
		//Place Last Breakpoint here.
		System.out.println(" Last Breakpoint Passsed ");

		return "helloWorld";
	}
}
