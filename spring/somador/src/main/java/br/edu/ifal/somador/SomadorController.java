package br.edu.ifal.somador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SomadorController {

	@GetMapping("/formulario")
	public String exibirForm() {
		return "formSoma";
	}
	
	@GetMapping("/somar")
	public String somar(Integer numero1, Integer numero2, Model model) {
		Integer soma = numero1 + numero2;
		
		model.addAttribute("resultadoSoma", soma);
		
		return "resultadoSoma";
	}
	
}
