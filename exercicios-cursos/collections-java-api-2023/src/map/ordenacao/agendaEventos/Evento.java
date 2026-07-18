public class Evento {

	private String nome;
	private String atracao;

	public Evento(String inputNome, String inputAtracao) {
		if (inputNome != null && !inputNome.isEmpty() && inputAtracao != null && !inputAtracao.isEmpty()) {
			this.nome = inputNome;
			this.atracao = inputAtracao;
		}
	}

	public String getNome() {
		return nome;
	}

	public String getAtracao() {
		return atracao;
	}

	@Override
	public String toString() {
		return "Evento {" + System.lineSeparator() +
				"	Nome->" + this.nome + System.lineSeparator() +
				"	Atracao->" + this.atracao + System.lineSeparator() +
				"}";
	}

}