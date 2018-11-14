package br.edu.ifal.validacao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoaController {

	@GetMapping("/")
	public String exibirFormulario(Model model) {
		model.addAttribute("pessoa", new Pessoa());
		
		return "formulario";
	}
	
	@PostMapping("/cadastrarPessoa")
	public String cadastrar(@ModelAttribute Pessoa pessoa) {
		return "exibirPessoa";
	}
	
}
