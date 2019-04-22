package br.edu.ifal.pweb;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

	@GetMapping("/novo")
	public String exibirForm(Model model) {
		Usuario usuario = new Usuario();
		
//		model.addAttribute("usuario", usuario);
		model.addAttribute(usuario);
		
		return "formulario";
	}
	
	@PostMapping("/cadastrar")
	public String cadastrar(@ModelAttribute Usuario usuario) {
		Date agora = new Date();
		usuario.setDataCadastro(agora);
		
		//TODO: inserir no banco de dados
		
		return "usuario";
	}
	
}
