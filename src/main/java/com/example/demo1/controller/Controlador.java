package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
public class Controlador {
	@GetMapping("/enviar")
	public String enviar() {
		return "enviar";
	}
}
