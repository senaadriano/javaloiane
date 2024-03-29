package br.adriano.aulas.aula35.exer02;

public class CalculadoraSomatorio {

	public static int somatorio(int num) {
		
		if (num ==1) {
			return 1;
		}
		
		return num + somatorio (num-1);
	}
}
