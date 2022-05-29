package exercicio5;

public class Exercicio5 {
	public static void main(String[] args) {

		Editora editora = new Editora();
		editora.setId(102050L);
		editora.setNome("Globo");
		editora.setEmail("editoraglobo@globo.com.br");
		int idEditora = editora.getId().intValue();

		Livro livro = new Livro(idEditora);
		livro.setTitulo("O livro da história");
		livro.setAutor("Rafael Longo");
		livro.setAno(2017);

		Livro livro2 = new Livro(idEditora);
		livro2.setTitulo("O livro da filosofia");
		livro2.setAutor("Rafael Longo");
		livro2.setAno(2017);

		editora.getLivros().add(livro);
		editora.getLivros().add(livro2);

		System.out.println(editora);
		System.out.println();

		System.out.println(livro);
	}

}
