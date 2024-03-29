package br.adriano.aulas.aula43.exer01;

public class ContaBancaria {

	private String nome;
	private String numConta;
	private double saldo;
	
	
	@Override
	public String toString() {
		return "[ContaBancaria] Nome = " + nome + ", Número da Conta = " + 
	numConta + ", saldo = " + saldo ;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	public boolean sacar(double valor) {
		if((saldo-valor) >=0 ) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	
}
