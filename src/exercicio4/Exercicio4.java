package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Menu menu = new Menu();

		int opcaoDigitada;

		do {
			System.out.println("**** MENU ****");
			System.out.println("1 - Cadastrar Artista & Albúm ");
			System.out.println("2 - Ver total de Artistas");
			System.out.println("3 - Ver quantidade de Artistas");
			System.out.println("4 - Apagar todos os Artistas ");
			System.out.println("5 - Buscar Artista");
			System.out.println("0 - Sair");

			System.out.print("Digite a opção desejada: ");
			opcaoDigitada = new Scanner(System.in).nextInt();

			switch (opcaoDigitada) {

			case 1:
				System.out.println("\n###############################");
				System.out.println("## Cadastrar Artista & Albúm ##");
				System.out.println("###############################");
				Artista artista = new Artista();
				System.out.print("Digite o nome do Artista: ");
				String nomeDigitado = new Scanner(System.in).nextLine();
				artista.setNomeArtista(nomeDigitado);

				String opcaoAlbum = "";
				do {
					Album album = new Album();
					System.out.print("Digite o nome do Albúm: ");
					String albumDigitado = new Scanner(System.in).nextLine();
					album.setDescricao(albumDigitado);
					artista.getAlbuns().add(album);

					System.out.println("Deseja cadastrar mais albúns ?");
					System.out.println("Digite [S]-SIM ou [N]-NAO: ");
					opcaoAlbum = new Scanner(System.in).next();

				} while ("S".equalsIgnoreCase(opcaoAlbum));

				menu.adicionarArtista(artista);
				System.out.print("Cadastrado com sucesso!\n\n");
				break;

			case 2:
				System.out.println("\n###############################");
				System.out.println("## Ver total de Artistas ##");
				System.out.println("###############################");
				if (menu.getArtistas().isEmpty()) {
					System.out.println("Não há artistas cadastrados");
				} else {
					menu.imprimirArtistas();
				}
				System.out.println();
				break;
			case 3:
				System.out.println("\n###############################");
				System.out.println("## Ver quantidade de Artistas ##");
				System.out.println("###############################");
				System.out.println("Total de cadastros: " + menu.obterQuantidadeDeArtistas());
				System.out.println();
				break;
			case 4:
				System.out.println("\n###############################");
				System.out.println("## Apagar todos os Artistas ##");
				System.out.println("###############################");
				if (menu.getArtistas().isEmpty()) {
					System.out.println("Não há artistas para excluir.");
				} else {
					System.out.println("Tem certeza que deseja excluir ?");
					System.out.println("Digite [S]-SIM ou [N]-NAO: ");
					String confirma = new Scanner(System.in).next();
					if (confirma.equalsIgnoreCase("S")) {
						menu.apagarTudo();
						System.out.println("Artista(s) excluido(s) com sucesso");
					}
				}
				System.out.println();
				break;

			case 5:
				System.out.println("\n###############################");
				System.out.println("## Buscar Artista ##");
				System.out.println("###############################");
				System.out.println("Digite o nome do artista: ");
				String nomeParaPesquisar = new Scanner(System.in).nextLine();
				menu.buscarArtistaPorNome(nomeParaPesquisar);
				System.out.println("");
				break;
			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default:
				System.out.println("Opcao inválida.");
			}
		} while (opcaoDigitada != 0);

	}
}