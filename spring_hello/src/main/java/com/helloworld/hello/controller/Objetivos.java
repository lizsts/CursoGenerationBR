package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {

	@GetMapping
	public String objetivos() {

		return "O meu objetivo dessa semana é fazer 5 anos em 5 dias.";

	}
}
