package br.adriano.aulas.matrizes;

import java.util.Scanner;

public class EArrays06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] a = new int [10];
		int[] b = new int [10];
		int[] c = new int [a.length];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o valor de A na "
					+ "posição: " + i);
			a[i]=sc.nextInt();
			System.out.println("Informe o valor de B na "
					+ "posição: " + i);
			b[i]=sc.nextInt();
			c[i]=a[i]+b[i];
			System.out.println("Valor de C é: "+a[i]+ 
					" + " + b[i] +" = "+ c[i]);
		}
	}

}
