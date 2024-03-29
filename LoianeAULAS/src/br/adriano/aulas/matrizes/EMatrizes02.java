package br.adriano.aulas.matrizes;

import java.util.Random;

public class EMatrizes02 {

	public static void main(String[] args) {

		int[][] M = new int [10][10];
		int maiorL5 = 0;
		int menorL5 = 0;
		int linha5 = 5;
		int col = 0;

		Random rd = new Random(100);

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = rd.nextInt(100);
			}
		}
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M [i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < M[linha5].length; i++) {
			if(M[linha5][i]>maiorL5) {
				maiorL5 = M[linha5][i];

			}
			if(M[linha5][i]<menorL5) {
				menorL5 = M[linha5][i];
			}
		}
		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("menor valor da linha 5 = " + menorL5);

		int maiorC7 = 0;
		int menorC7 = 101;
		int col7 = 7;

		for (int i = 0; i < M.length; i++) {
			if(M[i][col7]>maiorC7) {
				maiorC7 = M[i][col7];
			}
			if(M[i][col7]<menorC7) {
				menorC7 = M[i][col7];
			}
		}
		System.out.println("Maior valor da coluna 7 = " + maiorC7);
		System.out.println("menor valor da coluna 7 = " + menorC7);
	}

}

