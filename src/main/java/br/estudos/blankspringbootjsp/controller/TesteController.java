package br.estudos.blankspringbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {
	
	@GetMapping("/")
	public String teste() {
		return "pagina-teste";
	}
}
