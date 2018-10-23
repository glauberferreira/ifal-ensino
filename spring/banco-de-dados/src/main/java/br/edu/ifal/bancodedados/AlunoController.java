package br.edu.ifal.bancodedados;

import java.util.Optional;

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
		
		return "redirect:/listarAlunos";
	}
	
	@GetMapping("/listarAlunos")
	public String listar(Model model) {
		Iterable<Aluno> alunos = alunoRepository.findAll();
		
		model.addAttribute("alunos", alunos);
		
		return "tabelaAlunos";
	}
	
	@GetMapping("/exibir")
	public String exibir(Integer id, Model model) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		
		// TODO: Pode-se não encontrar um aluno com este id. Trataremos depois.
		model.addAttribute("aluno", aluno.get());
		
		return "exibirAluno";
	}
	
	@GetMapping("/excluir")
	public String excluir(Integer id) {
		alunoRepository.deleteById(id);
		
		return "redirect:/listarAlunos";
	}
	
}