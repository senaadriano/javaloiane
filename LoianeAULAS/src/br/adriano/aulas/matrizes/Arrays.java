package br.adriano.aulas.matrizes;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {

		double tempDia01 = 31.3;
		double tempDia02 = 32;
		double tempDia03 = 32.4;
		double tempDia04 = 30;
		double tempDia05 = 28;

		double[] temperaturas = new double[6];

		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 32.4;
		temperaturas[3] = 30;
		temperaturas[4] = 28;

		System.out.println("O valor da temperatura do dia "
				+ "1 é : " +temperaturas[2]);

		System.out.println("O tamanho do array : " 
				+ temperaturas.length);

		System.out.println("Valores do array: ");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Valor do dia " +
					(i+1)+" é: "+ temperaturas[i]);

		}
	}
}
