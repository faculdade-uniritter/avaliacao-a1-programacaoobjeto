package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Studant {

	private static final double PESO_NOTA_UM = 0.30;
	private static final double PESO_NOTA_DOIS = 0.35;
	private static final double PESO_NOTA_TRES = 0.35;

	Scanner scanner = null;

	public Studant() {
		scanner = new Scanner(System.in);
		// https://pt.stackoverflow.com/questions/149628/exception-in-thread-main-java-util-inputmismatchexception
		scanner.useLocale(Locale.US);
	}

	String digitarNomeAluno() {
		imprimir("Nome do aluno: ");
		String nome = this.scanner.nextLine();
		return nome;
	}

	double digitarNotaPrimeiroTrimestre() {
		imprimir("Nota do 1º Trimestre: ");
		double notaPrimeiroTrimestre = this.scanner.nextDouble();
		return notaPrimeiroTrimestre;
	}

	double digitarNotaSegundoTrimestre() {
		imprimir("Nota do 2º Trimestre: ");
		double notaSegundoTrimestre = this.scanner.nextDouble();
		return notaSegundoTrimestre;
	}

	double digitarNotaTerceiroTrimestre() {
		imprimir("Nota do 3º Trimestre: ");
		double notaTerceiroTrimestre = this.scanner.nextDouble();
		return notaTerceiroTrimestre;
	}

	void imprimir(String mensagem) {
		System.out.println(mensagem);
	}

	double calcularNotaFinal(double n1, double n2, double n3) {
		double nota1 = n1 * PESO_NOTA_UM;
		double nota2 = n2 * PESO_NOTA_DOIS;
		double nota3 = n3 * PESO_NOTA_TRES;
		double notaFinal = nota1 + nota2 + nota3;
		return notaFinal;
	}

	void imprimirRelatorioFinal(String nome, double notaFinal) {
		if (notaFinal >= 60.00) {
			System.out.println("PASS: Aluno " + nome + " Aprovado! ");
			System.out.printf("*** Nota Final: " + String.format("%,.2f", notaFinal));
		} else {
			System.out.println("FAILED: Aluno " + nome + " Reprovado! ");
			double faltaPontos = 60.00 - notaFinal;
			System.out.printf("*** Nota Final: " + String.format("%,.2f", notaFinal));
			System.out.printf("\n*** Faltaram " + String.format("%,.2f", faltaPontos) + " "
					+ "para aprovação com pontuação mínima exigida ***");
		}
	}
}