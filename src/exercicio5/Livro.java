package exercicio5;

public class Livro {
	private String titulo;
	private String autor;
	private int idEditora;
	private int ano;

	public Livro(int idEditora) {
		this.idEditora = idEditora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", idEditora=" + idEditora + ", ano=" + ano + "]";
	}

}
