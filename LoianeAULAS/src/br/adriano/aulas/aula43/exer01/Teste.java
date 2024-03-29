package br.adriano.aulas.aula43.exer01;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Teste ContaBancaria***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		
		contaSimples.setNome("ContaSimples1");
		contaSimples.setNumConta("1234");
		
		System.out.println(contaSimples);

		contaSimples.depositar(100);
		contaSimples.sacar(50);
		
		System.out.println(contaSimples);
		contaSimples.sacar(100);
		System.out.println(contaSimples);
		contaSimples.sacar(40);
		System.out.println(contaSimples);
		
	}

}
