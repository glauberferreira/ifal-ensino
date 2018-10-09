package br.edu.ifal.formulario;

public class Aluno {

	private String nome;
	private String matricula;
	private boolean estrangeiro;
	private String[] projetos;

	/**
	 * Formas de articulação entre a Educação Profissional Técnica de Nível Médio e
	 * o Ensino Médio
	 */
	private String formaArticulacao;
	private String uf;

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

	public String getFormaArticulacao() {
		return formaArticulacao;
	}

	public void setFormaArticulacao(String formaArticulacao) {
		this.formaArticulacao = formaArticulacao;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
