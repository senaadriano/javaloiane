package br.adriano.aulas.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Tyrion");

		//criando endereço
		Endereco end = new Endereco();
		end.setNomeRua("Pau brasil");
		end.setNumero("123");
		end.setCep("2323232");
		end.setCidade("Ssa");
		end.setComplemento("Perto dali");
		end.setEstado("BAHÊA");
		contato.setEndereco(end);
		if(contato != null && contato.getEndereco()!= null) {
			System.out.println(contato.getEndereco().getCidade());
		}

		//criando telefone
		Telefone tel = new Telefone();
		tel.setDd("71");
		tel.setNumero("1111111");
		tel.setTipo("Celular");


		Telefone tel2 = new Telefone();
		tel2.setDd("75");
		tel2.setNumero("222222");
		tel2.setTipo("casa");
		//contato.setTelefone(tel);

		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1]= tel2;
		contato.setTelefone(telefones);

		if(contato != null && contato.getTelefone()!= null) {
			for (Telefone t : contato.getTelefone()) {
				System.out.println(t.getDd()+ " " + t.getNumero());
			}
		}

	}

}
