package dio.desafio.abstraindoBootcampUsandoPOO.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);

	private Set<Dev> devsInscritos;
	private Set<Atividade> atividadesDoBootcamp;

	public Bootcamp(String inputNome, String inputDescricao) {
		if (inputNome != null && !inputNome.isEmpty())
			this.nome = inputNome;
		else
			throw new IllegalArgumentException("O nome não pode ser null ou vazio!");
		if (inputDescricao != null && !inputDescricao.isEmpty())
			this.descricao = inputDescricao;
		else
			throw new IllegalArgumentException("A descrição não pode ser null ou vazia!");
		this.devsInscritos = new HashSet<>();
		this.atividadesDoBootcamp = new HashSet<>();
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setAtividadesDoBootcamp(Atividade e){
		if (e==null) throw new IllegalArgumentException("A atividade não pode ser null!");
		this.atividadesDoBootcamp.add(e);
	}
	public Set<Atividade> getAtividadesDoBootcamp() {
		return atividadesDoBootcamp;
	}

}