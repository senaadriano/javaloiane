package br.adriano.aulas.aula43.exer01;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
	
	

	
	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + ", getDiaRendimento()=" + getDiaRendimento()
				+ ", getClass()=" + getClass() + ", getNome()=" + getNome() + ", getNumConta()=" + getNumConta()
				+ ", getSaldo()=" + getSaldo() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
}
