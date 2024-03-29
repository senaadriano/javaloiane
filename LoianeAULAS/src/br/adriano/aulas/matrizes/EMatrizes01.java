package br.adriano.aulas.matrizes;

import java.util.Random;

public class EMatrizes01 {

	public static void main(String[] args) {
		
		
		//Gera e imprime uma matriz M 4x4 com valores aleatórios, determina o maior valor e sua posição.

		int[][] mat = new int [4][4];
		int maior = 0;
		int linha = 0;
		int col = 0;

		Random n1 = new Random();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat [i][j] = n1.nextInt(100);
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > maior) {
					maior = mat [i][j] ;
					linha = i;
					col = j;	
				}
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat [i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Maior valor = "+maior);
		System.out.println("Linha = "+linha);
		System.out.println("Coluna = "+ col);
	}

}
