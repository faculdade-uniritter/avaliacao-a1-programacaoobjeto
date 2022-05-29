package exercicio3;

public class Exercicio3 {

	public static void main(String[] args) {
		Studant studant = new Studant();
		String nome = studant.digitarNomeAluno();
		double nota1Trimestre = studant.digitarNotaPrimeiroTrimestre();
		double nota2Trimestre = studant.digitarNotaSegundoTrimestre();
		double nota3Trimestre = studant.digitarNotaTerceiroTrimestre();
		double notaFinal = studant.calcularNotaFinal(nota1Trimestre, nota2Trimestre, nota3Trimestre);
		studant.imprimirRelatorioFinal(nome, notaFinal);
	}
}
