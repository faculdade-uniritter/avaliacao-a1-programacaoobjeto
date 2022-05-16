package exercicio2;

public class Elevador {

	private int andarAtual;
	private int totalAndaresPredio;
	private int capacidade;
	private int quantidadePessoas;

	void inicializar(int capacidade, int totalAndaresPredio) {
		this.capacidade = capacidade;
		this.totalAndaresPredio = totalAndaresPredio;
		this.andarAtual = 0;
		this.quantidadePessoas = 0;
	}

	void entrar() {
		if (quantidadePessoas < capacidade) {
			this.quantidadePessoas++;
			System.out.println("A quantidade de pessoas no elevador é de: " + quantidadePessoas);
		} else {
			System.out.println("Capacidade excedida! Aguarde o próximo elevador. ");
		}
	}

	void sair() {
		if (quantidadePessoas > 0) {
			this.quantidadePessoas--;
		}
		System.out.println("A quantidade de pessoas no elevador é de: " + quantidadePessoas);
	}

	void subir() {
		if (andarAtual < totalAndaresPredio) {
			this.andarAtual++;
			System.out.println("O andar atual é: " + andarAtual + "º");
		} else {
			System.out.println("Não existem mais andares para subir ");
		}
	}

	void descer() {
		if (andarAtual > 0) {
			this.andarAtual--;
			System.out.println("O andar atual é: " + andarAtual + "º");
		} else {
			System.out.println("Aguarde para subir. ");
		}

	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndaresPredio() {
		return totalAndaresPredio;
	}

	public void setTotalAndaresPredio(int totalAndaresPredio) {
		this.totalAndaresPredio = totalAndaresPredio;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

}
