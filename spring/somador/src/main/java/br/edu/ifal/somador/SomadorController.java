package br.edu.ifal.somador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SomadorController {

	@GetMapping("/formulario")
	public String exibirForm() {
		return "formSoma";
	}
	
	@GetMapping("/somar")
	public String somar() {
		return "resultadoSoma";
	}
	
}
