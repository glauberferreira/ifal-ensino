package br.edu.ifal.bancodedados;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {

	private AlunoRepository alunoRepository;
	
	public AlunoController(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

	@GetMapping("/formulario")
	public String exibirForm(Model model) {
		model.addAttribute("aluno", new Aluno());
		
		return "formAluno";
	}

	@PostMapping("/cadastrarAluno")
	public String cadastrar(@ModelAttribute Aluno aluno) {
		alunoRepository.save(aluno);
		
		return "exibirAluno";
	}

}