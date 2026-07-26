package models;

public class Cliente {
	private String nome;
	private int idade;

	public Cliente(String inputNome, int inputIdade) {
		if (inputNome == null) throw new NullPointerException("Nome do cliente nao pode ser Null.");
		if (inputNome.isEmpty()) throw new IllegalArgumentException("Precisa de um nome!");
		if (inputIdade<18) throw new IllegalArgumentException("Idade precisa ser maior que 18");
		
		this.nome = inputNome;
		this.idade = inputIdade;		
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}