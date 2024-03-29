package br.adriano.aulas.matrizes;

import java.util.Scanner;

public class EMatrizes03 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int[][] M = new int[3][3];
		int linha = 0;
		int coluna = 0;
		int qtdImpares = 0;
		int qtdPares = 0;

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.println("Informe o valor da linha "+ i+" e coluna "+j);
				M[i][j]=sc.nextInt();
				linha = i;
				coluna = j;

			}

		}
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				if(M[i][j]%2==0) {
					qtdPares++;
				}else {
					qtdImpares ++;
				}
				System.out.print(M[i][j] + " |");
			}
			System.out.println();
		}
		System.out.println("Quantidade de pares: "+qtdPares);
		System.out.println("Quantidade de ímpares: "+qtdImpares);
	}
}
