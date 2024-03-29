package br.adriano.aulas.aula36.exer02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o nome do curso");
		String nomeCurso = sc.nextLine();

		System.out.println("Entre com o horário do curso");
		String horario = sc.nextLine();

		System.out.println("Entre com o nome do professor");
		String nomeProfessor = sc.nextLine();

		System.out.println("Entre com o email");
		String emailProfessor = sc.nextLine();

		System.out.println("Entre com o departamento do professor");
		String departamento = sc.nextLine();

		Curso curso = new Curso();
		curso.setNome(nomeCurso);
		curso.setHorario(horario);

		Professor professor = new Professor();
		professor.setDepartamento(departamento);
		professor.setEmail(emailProfessor);
		professor.setNome(nomeProfessor);

		curso.setProfessor(professor);

		System.out.println("--- ALUNOS---");

		Aluno[] alunos = new Aluno[5];


		for (int i = 0; i <5; i++) {
			sc.nextLine();

			System.out.println("Entre com o nome do aluno "+ (i+1));
			String nomeAluno = sc.nextLine();

			System.out.println("Entre com a matrícula do aluno "+ (i+1));
			String matriculaAluno = sc.nextLine();

			double[] notas = new double[4];

			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com a nota "+(j+1));
				notas[j] = sc.nextDouble();
			}

			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriculaAluno);
			aluno.setNotas(notas);

			alunos[i] = aluno;
		}
		curso.setAlunos(alunos);

		System.out.println(curso.obterInfo());

	}

}
