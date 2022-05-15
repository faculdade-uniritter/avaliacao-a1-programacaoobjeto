package exercicio1;

public class Exercicio1 {

	public static void main(String[] args) {

		Agenda a = new Agenda();
		a.armazenarPessoa("João", 52, 1.72f);
		a.armazenarPessoa("Vanessa", 27, 1.60f);
		a.armazenarPessoa("Maria", 33, 1.65f);
		a.armazenarPessoa("Pedro", 49, 1.78f);
		a.armazenarPessoa("Joaquim", 67, 1.90f);
		a.armazenarPessoa("Mariana", 18, 1.58f);
		a.armazenarPessoa("José", 39, 1.76f);
		a.armazenarPessoa("Floriano", 55, 1.82f);
		a.armazenarPessoa("Jasmin", 22, 1.62f);
		a.armazenarPessoa("Sarah", 47, 1.66f);
		a.imprimeAgenda();
		a.imprimePessoa(6);
		int posicaoEncontrada = a.buscaPessoa("joaquim");
		System.out.println(posicaoEncontrada);
		a.removePessoa("joaquim");
		posicaoEncontrada = a.buscaPessoa("joaquim");
		System.out.println(posicaoEncontrada);

	}
}
