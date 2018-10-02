package br.edu.ifal.somador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SomadorController {

	@GetMapping("/formulario")
	public String exibirForm() {
		return "formSoma";
	}
	
	@PostMapping("/somar")
	public String somar(Integer numero1, Integer numero2, Model model) {
		Integer soma = numero1 + numero2;
		
		model.addAttribute("resultadoSoma", soma);
		model.addAttribute("termo1", numero1);
		model.addAttribute("termo2", numero2);
		
		return "resultadoSoma";
	}
	
}
