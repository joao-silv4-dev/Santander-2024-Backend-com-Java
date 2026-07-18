import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos{
	private Map<Long, Produto> estoqueMap;

	public EstoqueProdutos(){
		this.estoqueMap = new HashMap<>();
	}

	public void exibirProduto(long e, Produto o){
		if (!this.estoqueMap.isEmpty()&&this.estoqueMap.containsKey(e))
			System.out.println("Produto {"+System.lineSeparator()+
				"	Codigo->"+e+System.lineSeparator()+
				"	Nome->"+this.estoqueMap.get(e).getNome()+System.lineSeparator()+
				"	Preço->"+this.estoqueMap.get(e).getPreco()+System.lineSeparator()+
				"	Quantidade->"+this.estoqueMap.get(e).getQuantidade()+System.lineSeparator()+"}");
	}

	public void adicionarProduto(long inputCod, String inputNome, int inputQuantidade, double inputPreco){
		if (inputNome!=null&&!inputNome.isEmpty() && inputQuantidade>0 && inputPreco>0){
			this.estoqueMap.put(inputCod, new Produto(inputNome, inputQuantidade, inputPreco));
		}
	}

	public void exibirProdutos(){
		if (!this.estoqueMap.isEmpty()){
			for (Long key : this.estoqueMap.keySet()) {
				exibirProduto(key, this.estoqueMap.get(key));
			}
		}
	}

	public void calcularValorTotalEstoque(){
		double valorTotal = 0d;

		if (!this.estoqueMap.isEmpty()){
			for (Long key : this.estoqueMap.keySet()) {
				valorTotal += this.estoqueMap.get(key).getPreco() * this.estoqueMap.get(key).getQuantidade();
			}
		}

		System.out.println("Valor total->"+valorTotal);
	}

	public void obterProdutoMaisCaro(){
		double valorMaisCaro = 0;

		if (!this.estoqueMap.isEmpty()){
			for (Long key : this.estoqueMap.keySet()) {
				
				if (valorMaisCaro < this.estoqueMap.get(key).getPreco()){
					valorMaisCaro = this.estoqueMap.get(key).getPreco();
				}

			}
		}

		System.out.println("Valor mais caro->"+valorMaisCaro);

	}

	public void obterProdutoMaisBarato(){
		double valorMaisBarato = Double.MAX_VALUE;

		if (!this.estoqueMap.isEmpty()){
			for (Long key : this.estoqueMap.keySet()) {
				if (valorMaisBarato > this.estoqueMap.get(key).getPreco()){
					valorMaisBarato = this.estoqueMap.get(key).getPreco();
				}
			}
		}

		System.out.println("Valor mais barato->"+valorMaisBarato);

	}

	public void obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
		
		if (!this.estoqueMap.isEmpty()){
			Produto produto = null;
			double valorTotal = 0;
			long keyE = 0;

			for (Long key : this.estoqueMap.keySet()) {
				if ( (this.estoqueMap.get(key).getPreco()*this.estoqueMap.get(key).getQuantidade()) > valorTotal){
					valorTotal = this.estoqueMap.get(key).getPreco()*this.estoqueMap.get(key).getQuantidade();
					produto = this.estoqueMap.get(key);
					keyE = key;
				}
			}

			exibirProduto(keyE, produto);
		} else System.out.println("Lista vazia!");
	}

}