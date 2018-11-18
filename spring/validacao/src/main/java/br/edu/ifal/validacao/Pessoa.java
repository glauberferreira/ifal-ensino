package br.edu.ifal.validacao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Pessoa {

	@NotBlank
	@Size(min = 3, max = 60)
	private String nome;
	private Integer idade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
