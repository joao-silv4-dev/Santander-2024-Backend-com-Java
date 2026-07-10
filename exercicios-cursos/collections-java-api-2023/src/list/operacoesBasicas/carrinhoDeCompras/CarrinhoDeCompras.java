package list.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{

	private List<Item> listaDeItens;

	public CarrinhoDeCompras(){
		this.listaDeItens = new ArrayList<>();
	}

	public void adicionarItem(String inputNome, double inputPreco, int inputQuantidade){
		listaDeItens.add(new Item(inputNome, inputPreco, inputQuantidade));
	}

	public void removerItem(String inputNome){
		if (listaDeItens.size()>0)
			for (Item e : listaDeItens){
				if (e.getNome().equals(inputNome))
					listaDeItens.remove(e);
			}
		else System.out.println("Lista vazia!");
	}

	public void exibirItens(){
		if (listaDeItens.size()>0)
			for (Item e : listaDeItens){
				System.out.println("Nome: "+e.getNome());
				System.out.println("Preco: "+e.getPreco());
				System.out.println("Quantidade: "+e.getQuantidade());
				System.out.println();
			}
		else System.out.println("Lista vazia!");
	}

	public double calcularValorTotal(){
		if (listaDeItens.size()>0){
			double valorTotal = 0;
			for (Item e : listaDeItens){
				valorTotal = (e.getPreco() * e.getQuantidade()) + valorTotal;
			}
			return valorTotal;
		} else System.out.println("Lista vazia!");
		return 0;
	}
}