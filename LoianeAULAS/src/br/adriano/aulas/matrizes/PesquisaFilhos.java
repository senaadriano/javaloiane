package br.adriano.aulas.matrizes;

import java.util.Scanner;

public class PesquisaFilhos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qntFilhos = 0;
		int qntEntrevistados = 0;

		System.out.println("Informe o número de entrevistados: ");
		qntEntrevistados = sc.nextInt();

		String[][] nomeFilhos = new String[qntEntrevistados][];

		for (int i = 0; i < nomeFilhos.length; i++) {
			System.out.println("Informe a quantidade de filhos do "+(i+1)+" entrevistado: ");
			qntFilhos = sc.nextInt();
			
			nomeFilhos[i] = new String [qntFilhos];

			for (int j = 0; j < nomeFilhos[i].length; j++) {
				System.out.println("Informe o nome do filho " + (j+1));
				nomeFilhos[i][j] = sc.next();
			}

		}
		for (int i = 0; i < nomeFilhos.length; i++) {
			System.out.println("Pessoa "+(i+1) +" tem "+nomeFilhos[i].length+" filhos: ");
			for (int j = 0; j < nomeFilhos[i].length; j++) {
				System.out.println(nomeFilhos[i][j]);
			}
		}

	}

}
