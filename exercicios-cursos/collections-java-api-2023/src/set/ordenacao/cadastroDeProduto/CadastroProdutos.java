import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
	private Set<Produto> produtoSet;

	public CadastroProdutos(){
		this.produtoSet = new HashSet<>();
	}

	public void adicionarProduto(long cod, String nome, double preco, int quantidade){

		if (nome!=null&&!nome.isEmpty() && cod>0 && preco>0 && quantidade>0)
			produtoSet.add(new Produto(nome, preco, quantidade, cod));
		else
			System.out.println("Não foi possivel adicionar o produto");
	}

	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> ordenadoPorNome = null;

		if (!produtoSet.isEmpty()){
			ordenadoPorNome = new TreeSet<>(this.produtoSet);
		}

		return ordenadoPorNome;
	}

	public Set<Produto> exibirProdutosPorPreco(){

		if (!produtoSet.isEmpty()){
			Set <Produto> ordenadoPorPreco = new TreeSet<>(new CompararPorNome());
			ordenadoPorPreco.addAll(this.produtoSet);
			return ordenadoPorPreco;
		}

		return null;
	}
}

class CompararPorNome implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}

}