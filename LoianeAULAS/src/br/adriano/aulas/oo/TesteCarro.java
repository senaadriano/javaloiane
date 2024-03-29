package br.adriano.aulas.oo;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.cor = "Verde";
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.qtdPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
	}

}
