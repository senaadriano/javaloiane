package br.adriano.aulas.matrizes;

import java.util.Scanner;

public class EArrays02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] A = new int[8];
		int[] B = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor "
					+ "da posição: " + i);
			A[i] = sc.nextInt();
			B[i] = A[i]*2;
			System.out.println("Valor de B: " + B[i]);
		}

	}

}
