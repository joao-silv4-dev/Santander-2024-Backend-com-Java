public class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicacao;

	public Livro(
		String inputTitulo, String inputAutor, int inputAnoDePublicacao){
		if ( inputTitulo != null && !inputTitulo.isEmpty() )
			this.titulo = inputTitulo;

		if ( inputAutor != null && !inputAutor.isEmpty() )
			this.autor = inputAutor;

		if ( inputAnoDePublicacao>0)
			this.anoDePublicacao = inputAnoDePublicacao;

	}

	public String getTitulo(){
		return this.titulo;
	}

	public String getAutor(){
		return this.autor;
	}

	public int getAnoDePublicacao(){
		return this.anoDePublicacao;
	}
}