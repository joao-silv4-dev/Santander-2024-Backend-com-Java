import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> listaLivros;

	public CatalogoLivros() {
		this.listaLivros = new ArrayList<>();
	}

	public void adicionarLivro(
			String titulo, String autor, int anoDePubicacao) {
		try {
			this.listaLivros.add(new Livro(titulo, autor, anoDePubicacao));
		} catch (Exception e) {
			System.out.println("Err: " + e);
		}
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosAutor = new ArrayList<>();

		for (Livro e : listaLivros) {
			if (e.getAutor().equalsIgnoreCase(autor)) {
				livrosAutor.add(e);
			}
		}

		return livrosAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosIntervaloAnos = new ArrayList<>();

		if (!listaLivros.isEmpty()) {
			for (Livro e : listaLivros) {
				if (e.getAnoDePublicacao() >= anoInicial && e.getAnoDePublicacao() <= anoFinal)
					livrosIntervaloAnos.add(e);
			}

			if (livrosIntervaloAnos.size() > 0)
				return livrosIntervaloAnos;
		}
		return null;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		if (!listaLivros.isEmpty()) {
			for (Livro e : listaLivros) {
				if (e.getTitulo().equalsIgnoreCase(titulo))
					return e;
			}
		}
		return null;
	}

	public List<Livro> getCatalogoCompleto() {
		if (!listaLivros.isEmpty())
			return listaLivros;
		return null;
	}

	public void mostratListaToda(List<Livro> list){
		for(Livro e : list){
			System.out.println("Titulo: "+e.getTitulo());
			System.out.println("Autor: "+e.getAutor());
			System.out.println("Ano de publicacao: "+e.getAnoDePublicacao());
			System.out.println();
		}
	}
}