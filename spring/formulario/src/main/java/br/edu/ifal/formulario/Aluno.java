package br.edu.ifal.formulario;

public class Aluno {

	private String nome;
	private String matricula;
	private boolean estrangeiro;
	private String[] projetos;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isEstrangeiro() {
		return estrangeiro;
	}

	public void setEstrangeiro(boolean estrangeiro) {
		this.estrangeiro = estrangeiro;
	}

	public String[] getProjetos() {
		return projetos;
	}

	public void setProjetos(String[] projetos) {
		this.projetos = projetos;
	}
	
}
