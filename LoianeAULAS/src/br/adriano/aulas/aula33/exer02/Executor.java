package br.adriano.aulas.aula33.exer02;

public class Executor {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("12345");
		conta.setAgencia("321");
		conta.setEspecial(true);
		conta.setLimiteEspecial(600);
		conta.setSaldo(700);
		
		
		System.out.println("Número da conta: "+conta.getNumero());
		
		}

}
