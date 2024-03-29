package br.adriano.aulas.aula36.exer01;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o nome da agenda");
		String nome = sc.nextLine();

		Agenda agenda = new Agenda();
		agenda.setNome(nome);

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações do contato: " + (i+1));
			Contato c = new Contato();

			System.out.println("Entre o nome do contato " + i+1);
			nome = sc.nextLine();
			c.setNome(nome);

			System.out.println("Entre o telefone do contato " + i+1);
			String telefone = sc.nextLine();
			c.setTelefone(telefone);

			System.out.println("Entre o email do contato " + i+1);
			String email = sc.nextLine();
			c.setEmail(email);

			contatos [i] = c;

		}
		agenda.setContato(contatos);
		if(agenda!=null) {
			System.out.println(agenda.obterInfo());
		}

	}

}
