package br.adriano.aulas.aula36;

public class Contato {

	private String nome;    
	private Endereco endereco;
	private Telefone[] telefone;


	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Telefone[] getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}

}
