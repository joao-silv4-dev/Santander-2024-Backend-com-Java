public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private int idade;
	private double altura;

	public Pessoa(String inputNome, int inputIdade, double inputAltura) {
		if (inputNome != null && !inputNome.isEmpty() && inputIdade > 0 && inputAltura > 0) {
			this.nome = inputNome;
			this.idade = inputIdade;
			this.altura = inputAltura;
		}
	}

	@Override
	public int compareTo(Pessoa e) {
		return Integer.compare(this.idade, e.getIdade());
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

}