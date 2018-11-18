package br.edu.ifal.templates;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping("/exibirDataAtual")
	public String exibirDataAtual(Model model) {
		model.addAttribute("data", new Date());
		
		return "data-atual";
	}
	
}
