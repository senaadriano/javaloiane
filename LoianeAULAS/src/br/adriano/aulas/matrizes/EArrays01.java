package br.adriano.aulas.matrizes;

import java.util.Scanner;

public class EArrays01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length;i++ ) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = sc.nextInt();

		}
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i];

		}
		System.out.print("Valor do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println("\n");
		System.out.print("Valor do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
}

