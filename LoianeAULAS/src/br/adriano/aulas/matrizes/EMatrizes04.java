package br.adriano.aulas.matrizes;

import java.util.Scanner;

public class EMatrizes04 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String[][] agenda = new String[31][24];
		boolean sair = false;
		boolean diaValido = false;
		boolean horaValida = false;
		int menu =0;
		int hora =0;
		int dia =0;


		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			menu = sc.nextInt();

			if(menu == 1) {

				while(!diaValido) {
					System.out.println("Informe o dia do mês");
					dia = sc.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido digite novamente");
					}
				}
				while(!horaValida) {
					System.out.println("Informe a hora do dia");
					hora = sc.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					}else {
						System.out.println("Hora inválido digite novamente");
					}
				}

				dia --;
				System.out.println("Digite o compromisso");

				agenda[dia][hora] = sc.next();


			}else if(menu == 2) {

				while(!diaValido) {
					System.out.println("Informe o dia do mês");
					dia = sc.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido digite novamente");
					}
				}
				while(!horaValida) {
					System.out.println("Informe a hora do dia");
					hora = sc.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					}else {
						System.out.println("Hora inválido digite novamente");
					}
				}

				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(agenda[dia][hora]);

			}else if(menu == 0) {
				sair =true;
			}else {
				System.out.println("Opção inválida digite novamente");
			}
		}


	}

}
