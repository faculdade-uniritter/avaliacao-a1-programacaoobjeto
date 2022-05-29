package exercicio4;

import java.util.ArrayList;

public class Menu {
	private ArrayList<Artista> artistas;

	public Menu() {
		artistas = new ArrayList<Artista>();
	}

	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public void setMenu(ArrayList<Artista> menu) {
		this.artistas = menu;
	}

	@Override
	public String toString() {
		return "Menu{" + "artistas=" + artistas + "}";
	}

	public void adicionarArtista(Artista a1) {
		this.artistas.add(a1);
	}

	public void apagarTudo() {
		this.artistas.clear();
	}

	public void imprimirArtistas() {
		for (Artista artista : this.artistas) {
			System.out.println("Artista: " + artista.getNomeArtista());
			for (Album album : artista.getAlbuns()) {
				System.out.println("Albúm: " + album.getDescricao());
			}
			System.out.println();
		}
	}

	public int obterQuantidadeDeArtistas() {
		return this.artistas.size();
	}

	public void buscarArtistaPorNome(String nomeDigitado) {
		ArrayList<Artista> artistasEncontrados = new ArrayList<Artista>();
		for (Artista artista : this.artistas) {
			if (nomeDigitado.equalsIgnoreCase(artista.getNomeArtista())) {
				artistasEncontrados.add(artista);
			}
		}
		if(artistasEncontrados.isEmpty()) {
			System.out.println("Artista(s) encontrado(s): 0");
		} else {
			System.out.println("Artista(s) encontrado(s):");
			for (Artista artista : artistasEncontrados) {
				System.out.println("Artista: " + artista.getNomeArtista());
				for (Album album : artista.getAlbuns()) {
					System.out.println("Albúm: " + album.getDescricao());
				}
				System.out.println();
			}			
		}
	}

}
