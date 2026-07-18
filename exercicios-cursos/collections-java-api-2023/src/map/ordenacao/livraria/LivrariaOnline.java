import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class LivrariaOnline{
	private Map<String, Livro> catalogoLivraria;

	public LivrariaOnline(){
		this.catalogoLivraria = new HashMap<>();
	}

	public void adicionarLivro(String link, String titulo, String autor, double preco){
		Livro livro = new Livro(titulo, autor, preco);
		this.catalogoLivraria.put(link, livro);
	}

	public void removerLivro(String titulo){
		if (!this.catalogoLivraria.isEmpty()){
			for (String key : this.catalogoLivraria.keySet()){
				if (this.catalogoLivraria.get(key).getTitulo().toLowerCase() == titulo.toLowerCase()){
					this.catalogoLivraria.remove(key);
					break;
				}
			}
		}
	}

	public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
		if (!this.catalogoLivraria.isEmpty()){
			List<Map.Entry<String, Livro>> livroParaOrdenar = new ArrayList<>(this.catalogoLivraria.entrySet());
		
			Collections.sort(livroParaOrdenar, new ComparatorPorPreco());

			Map<String, Livro> livrosComparados = new LinkedHashMap<>();

			for (Map.Entry<String,Livro> entry : livroParaOrdenar){
				livrosComparados.put(entry.getKey(), entry.getValue());
			}

			return livrosComparados;
		}
		return null;
	}

	public void pesquisarLivrosPorAutor(String autor){
		if (!this.catalogoLivraria.isEmpty()){
			List<Livro> livrosDoAutor = new ArrayList<>();

			for (String key : this.catalogoLivraria.keySet()){
				if (this.catalogoLivraria.get(key).getAutor().toLowerCase().equals(autor.toLowerCase())){
					livrosDoAutor.add(this.catalogoLivraria.get(key));
				}
			}

			for (Livro o : livrosDoAutor){
				System.out.println(o);
			}
		}
	}

	public void obterLivroMaisCaro(){
		if (!this.catalogoLivraria.isEmpty()){
			Livro livroMaisCaro = new Livro(null, null, 0.001);

			for (String key : this.catalogoLivraria.keySet()){
				if (livroMaisCaro.getPreco()<this.catalogoLivraria.get(key).getPreco()){
					livroMaisCaro = this.catalogoLivraria.get(key);
				}
			}
			System.out.println(livroMaisCaro);
		}
	}

	public void exibirLivroMaisBarato(){
		if (!this.catalogoLivraria.isEmpty()){
			Livro livroMaisBarato = new Livro(null, null, 0.001);

			for (String key : this.catalogoLivraria.keySet()){
				if (livroMaisBarato.getPreco()>this.catalogoLivraria.get(key).getPreco()){
					livroMaisBarato = this.catalogoLivraria.get(key);
				}
			}
			System.out.println(livroMaisBarato);
		}
	}

	public static void main(String[] args) {
		LivrariaOnline livrariaOnline = new LivrariaOnline();

		livrariaOnline.adicionarLivro("link", "titulo", "autor", 1);
		livrariaOnline.adicionarLivro("link2", "titulo2", "autor2", 5);
		livrariaOnline.adicionarLivro("link3", "titulo3", "autor3", 8);
		livrariaOnline.adicionarLivro("link4", "titulo4", "autor4", 2);
		livrariaOnline.adicionarLivro("link5", "titulo5", "autor5", 10);

		System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

	}

}