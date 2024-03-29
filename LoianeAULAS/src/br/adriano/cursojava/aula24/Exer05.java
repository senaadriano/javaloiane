package br.adriano.cursojava.aula24;

public class Exer05 {

	public static void main(String[] args) {

		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 300;
		conta.saldo = 20;
		
		
		System.out.println("Saldo da conta "+conta.numero + "é : "+conta.saldo);
	}

}
