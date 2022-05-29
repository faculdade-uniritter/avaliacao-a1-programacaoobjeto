package exercicio4;

import java.util.ArrayList;

public class Artista {
	private String nomeArtista;
	private int totalArtistas;
	private ArrayList<Album> albuns;

	public Artista() {
		this.albuns = new ArrayList<Album>(0);
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public int getTotalArtistas() {
		return totalArtistas;
	}

	public void setTotalArtistas(int totalArtistas) {
		this.totalArtistas = totalArtistas;
	}

	public ArrayList<Album> getAlbuns() {
		return albuns;
	}
}