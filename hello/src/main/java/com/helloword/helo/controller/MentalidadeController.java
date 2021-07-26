package com.helloword.helo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping ("/mentalidade")
@RestController

public class MentalidadeController {
	@GetMapping
	public String mentalidade() {
		return "Mentalidades:\n"
				+ "PERSISTÊNCIA TODOS OS DIAS!!!\n"
				+ "Atenção ao detalhe.\n"
				+ "Orientação ao  futuro.\n";
	}
}
