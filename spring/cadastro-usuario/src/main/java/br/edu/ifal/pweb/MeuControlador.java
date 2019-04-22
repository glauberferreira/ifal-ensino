package br.edu.ifal.pweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeuControlador {

	@GetMapping("/glauber")
	public String paginaPrincipal() {
		return "pagina";
	}
	
	@GetMapping("/ifal")
	public String outroMetodo() {
		return "outra";
	}
	
	@GetMapping("/busca")
	public String buscar(@RequestParam String consulta, @RequestParam String nome, @RequestParam Integer idade, Model model) {
		System.out.println("Consulta = " + consulta);
		System.out.println("Nome = " + nome);
		System.out.println("Idade = " + idade);
		
		model.addAttribute("nome", nome.toUpperCase());
		model.addAttribute("idade", idade + 30);
		
		return "resultados";
	}
	
}
