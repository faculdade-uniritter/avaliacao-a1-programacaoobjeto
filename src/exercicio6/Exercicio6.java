package exercicio6;

public class Exercicio6 {
	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Anita Garibaldi");
		endereco.setComplemento("Apto 301");
		endereco.setNumero(180);
		endereco.setCep("90350-010");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria José");
		pessoa.setIdade(30);
		pessoa.setSexo('F');
		pessoa.setEnd(endereco);

		System.out.println(endereco);
		System.out.println("");
		System.out.println(pessoa);
	}

}
