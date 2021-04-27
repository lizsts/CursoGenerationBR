package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/bsm")
public class Bsm {
	//agora criando um controller
	
	@GetMapping
	
	public String bsm( ) {
		
		return "mentalidade de crescimento"; 
		
	}

}
