package com.helloword.helo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping ("/objetivos")
@RestController

public class AgendaSemanalController {
	@GetMapping
	public String agenda() {
		return "Objetivos de aprendizagem:\n"
				+ "Reclamar menos.\n"
				+ "Estudar Guanabara.\n"
				+ "Ter paciência.\n";
	}
}
