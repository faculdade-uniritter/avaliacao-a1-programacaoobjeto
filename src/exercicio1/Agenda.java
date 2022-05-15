package exercicio1;

/**
 * 1. (1,0) Crie uma classe Agenda que pode armazenar 10 pessoas e seja capaz de
 * realizada as seguintes operações:
 * 
 * 
 */
// Um método tem:
// [modificador de acesso], [tipo de retorno], [nome do método], [parâmetros
// opcionais]
public class Agenda {

	private Pessoa[] pessoas = new Pessoa[10];
	private int contador = 0;

	void armazenarPessoa(String nome, int idade, float altura) {
		if (contador <= 9) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nome);
			pessoa.setIdade(idade);
			pessoa.setAltura(altura);
			this.pessoas[contador] = pessoa;
			this.contador++;
		}
	}

	void removePessoa(String nome) {
		for (int index = 0; index < pessoas.length; index++) {
			Pessoa p = this.pessoas[index];
			if (p.getNome().equalsIgnoreCase(nome)) {
				this.pessoas[index] = null;
			}
		}
	}

	/**
	 * informe em que posição da agenda está a pessoa
	 * 
	 * @param nome
	 * @return
	 */
	int buscaPessoa(String nome) {
		boolean encontrouPessoa = false;
		int indexPessoa = 0;
		for (int index = 0; index < pessoas.length; index++) {
			Pessoa p = this.pessoas[index];
			if (p.getNome().equalsIgnoreCase(nome)) {
				encontrouPessoa = true;
				indexPessoa = index;
			}
		}
		if (!encontrouPessoa) {
			throw new RuntimeException("Nome não cadastrado");
		}

		return indexPessoa;

	}

	/**
	 * informe os dados de todas as pessoas da agenda
	 * 
	 */
	void imprimeAgenda() {
		for (int index = 0; index < pessoas.length; index++) {
			System.out.println("posição: " + index + " " + this.pessoas[index]);
		}
	}

	/**
	 * imprime os dados da pessoa que está na posição “i”da agenda
	 * 
	 * @param index
	 */
	void imprimePessoa(int index) {
		System.out.println("posição: " + index + " " + this.pessoas[index]);
	}

}
