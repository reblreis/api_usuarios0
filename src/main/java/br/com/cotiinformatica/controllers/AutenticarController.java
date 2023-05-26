package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // annotation para qualificar uma classe do Spring Boot como um controlador
				// através disso criamos endpoint e serviços para nossa API
@RequestMapping(value = "/api/autenticar")
public class AutenticarController {

	@PostMapping
	public void post() {
		// TODO
	}

	@PutMapping
	public void put() {
		// TODO
	}

	@DeleteMapping
	public void delete() {
		// TODO
	}

	@GetMapping
	public void getAll() {
		// TODO
	}
}
