package br.adriano.aulas.matrizes;

import java.util.Scanner;

public class EArrays04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] A = new int [15];
		double[] B = new double [A.length];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Informe o valor da "
					+ "posição: " + i);
			A[i] = sc.nextInt();
			B[i] = Math.sqrt(A[i]);
			System.out.println("Valor de B: " + B[i]);
		}
	}

}
