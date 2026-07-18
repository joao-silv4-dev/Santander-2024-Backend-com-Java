public class Produto{
	private String nome;
	private int quantidade;
	private double preco;

	public Produto(String inputNome, int inputQuantidade, double inputPreco){
		if (inputNome!=null&&!inputNome.isEmpty() && inputQuantidade>0 && inputPreco>0){
			this.nome = inputNome;
			this.quantidade = inputQuantidade;
			this.preco = inputPreco;
		}
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}
}