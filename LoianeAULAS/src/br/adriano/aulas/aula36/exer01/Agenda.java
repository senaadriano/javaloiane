package br.adriano.aulas.aula36.exer01;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContato() {
		return contatos;
	}
	public void setContato(Contato[] contato) {
		this.contatos = contato;
	}
	
	public String obterInfo() {
		String info = "Nome = " + this.nome + "\n ";
		
		if(contatos !=null) {
			for (Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		
		return info;
	}
	
	
}
