package br.edu.ifal.formulario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {
	
	@GetMapping("/formulario")
	public String exibirForm(Model model) {
		model.addAttribute("aluno", new Aluno());
		
		String[] projetos = {"Ensino", "Extensão", "Pesquisa"};
		model.addAttribute("todosProjetos", projetos);
		
		String[] formas = {"Integrada", "Concomitante", "Subsequente"};
		model.addAttribute("todasFormas", formas);
		
		return "formAluno";
	}
	
	@PostMapping("/cadastrarAluno")
	public String cadastrar(@ModelAttribute Aluno aluno) {
		aluno.setNome(aluno.getNome().toUpperCase());
		
		return "exibirAluno";
	}
	
}
