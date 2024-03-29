package br.adriano.aulas.matrizes;

import java.util.Iterator;
import java.util.Scanner;

public class EArrays05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o valor da"
					+ " posição " + i);
			a[i] = sc.nextInt();
			b[i] = (a[i]*i);
			System.out.println("Valor de B: " + b[i]);
			
		}
	}

}
