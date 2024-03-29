package br.adriano.cursojava.aula24;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {

		LivroBiblioteca livro1 = new LivroBiblioteca();

		livro1.nome = "Mastering ExtJS";
		livro1.autor = "Loiane Groner";
		livro1.anoLancamento = 2015;
		livro1.preco = 6.39;
		
		livro1.emprestado = true;
		livro1.emprestadoA = "Adriano";
		livro1.dataEntrega = new Date();
		
		System.out.println("Nome do livro = "+livro1.nome);


	}

}
