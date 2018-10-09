package br.edu.ifal.formulario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {
	
	@GetMapping("/formulario")
	public String exibirForm(Model model) {
		return "formAluno";
	}
	
	@PostMapping("/cadastrarAluno")
	public String cadastrar() {
		return "exibirAluno";
	}
	
}
