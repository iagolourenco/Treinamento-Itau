package br.com.itau.treinamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraController {
	
	@GetMapping("/olamundo")
	public String faleOla() {
		return "Ola!";
	}
	
	
}
