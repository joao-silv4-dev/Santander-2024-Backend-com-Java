public class Item {
	private String nome;
	private double preco;
	private int quantidade;

	public Item(String inputNome, double inputPreco, int inputQuantidade) {
		if (inputNome != null && !inputNome.isEmpty()) 
			this.nome = inputNome;
		
		if (inputPreco > 0) 
			this.preco = inputPreco;
		
		if (inputQuantidade > 0) 
			this.quantidade = inputQuantidade;
		
	}

	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return this.quantidade;
	}
}