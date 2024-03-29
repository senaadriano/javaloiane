package br.adriano.aulas.aula33.exer01;

public class Executor {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudaEstado();
		
		lampada.mostrarEstado();
		
	}

}
