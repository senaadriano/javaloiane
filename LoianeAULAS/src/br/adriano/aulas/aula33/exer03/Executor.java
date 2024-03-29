package br.adriano.aulas.aula33.exer03;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.println("Informe o nome do aluno");
		aluno.setNome(sc.next());

		System.out.println("Informe o nome do curso");
		aluno.setNomeCurso(sc.next());

		System.out.println("Informe a matrícula ");
		aluno.setMatricula(sc.next());

		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Informe o nome da disciplina "+i);
			aluno.setNomeDisciplinaPos(i, sc.next());
		}
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas da disciplina "+ aluno.getNomeDisciplinas()[i]);
			for (int j = 0; j <aluno.getNotasDisciplinas()[i].length; j++) {
				aluno.setNomePosIJ(i, j, sc.nextDouble());;
			}
		}

		aluno.mostrarInfo();

		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina "+ aluno.getNomeDisciplinas()[i] + " - foi aprovado");
			}else {
				System.out.println("Disciplina "+ aluno.getNomeDisciplinas()[i] + " - foi reprovado" );
			}
		}
	}

}
