package br.adriano.aulas.aula34.exer01;

public class Contador {

	private static int cont;
	
	public static void incrementar() {
		cont++;
	}
	public static void zerar() {
		cont=0;
	}
	public static int obterValor() {
		return cont;
	}
	
}
