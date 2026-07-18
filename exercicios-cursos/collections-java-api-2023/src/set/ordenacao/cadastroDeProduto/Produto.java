import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private String nome;
	private double preco;
	private int quantidade;
	private long codigo;

	public Produto(String inputNome, double inputPreco, int inputQuantidade, long inputCodigo){
		this.nome = inputNome;
		this.preco = inputPreco;
		this.quantidade = inputQuantidade;
		this.codigo = inputCodigo;
	}

	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public long getCodigo() {
		return this.codigo;
	}

	@Override
	public String toString(){
		return "Produto {"+ System.lineSeparator()+
		"	Nome->"+this.nome+ System.lineSeparator()+
		"	Preco->"+this.preco+ System.lineSeparator()+
		"	Quantidade->"+this.quantidade+ System.lineSeparator()+
		"	Codigo->"+this.codigo+ System.lineSeparator()+"}";
	}

	@Override
	public int hashCode(){
		return Objects.hash(getCodigo());
	}

	@Override
	public boolean equals(Object o){
		if (this==o) return true;
		if (!(o instanceof Produto e)) return false;
		return getCodigo()==e.getCodigo();
	}

	@Override
	public int compareTo(Produto o) {
		return this.getNome().compareToIgnoreCase(o.getNome());
	}

}