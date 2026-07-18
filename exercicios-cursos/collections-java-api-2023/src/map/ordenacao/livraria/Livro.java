import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Livro{
	private String titulo;
	private String autor;
	private double preco;

	public Livro(String inputTitulo, String inputAutor, double inputPreco){
		if (inputTitulo!=null&&!inputTitulo.isEmpty() && inputAutor!=null&&!inputAutor.isEmpty() && inputPreco>0){
			this.titulo = inputTitulo;
			this.autor = inputAutor;
			this.preco = inputPreco;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString(){
		return "Livro {"+System.lineSeparator()+
		"	Titulo->"+this.titulo+System.lineSeparator()+
		"	Autor->"+this.autor+System.lineSeparator()+
		"	Preco->"+this.preco+System.lineSeparator()+"}";
	}

}

class ComparatorPorPreco implements Comparator<Map.Entry<String,Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
    	return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
	}

}