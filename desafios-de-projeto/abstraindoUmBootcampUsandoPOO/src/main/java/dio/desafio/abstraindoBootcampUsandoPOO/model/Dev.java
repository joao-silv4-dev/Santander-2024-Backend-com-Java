package dio.desafio.abstraindoBootcampUsandoPOO.model;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Atividade> atividadesConcluidas;
	private Set<Atividade> atividadesInscritas;
	private Set<Bootcamp> bootcampsInscritos;
	private Double xpDoDev;

	public Dev(String inputNome) {
		if (inputNome != null && !inputNome.isEmpty())
			this.nome = inputNome;
		else
			throw new IllegalArgumentException("O nome precisa ter algo e não ser null!");
		this.atividadesConcluidas = new LinkedHashSet<>();
		this.atividadesInscritas = new LinkedHashSet<>();
		this.bootcampsInscritos = new LinkedHashSet<>();
		this.xpDoDev = 10d;
	}

	public void progredir(){
		Optional<Atividade> atividadePrimeira = this.atividadesInscritas.stream().findFirst();
		if (atividadePrimeira.isPresent()){
			
			Atividade atividade = atividadePrimeira.get();
			
			this.atividadesConcluidas.add(atividade);
			this.atividadesInscritas.remove(atividade);

			adicionarXP(atividade.calcularXP());
		
		} else {
			throw new IllegalArgumentException("Não tem atividades para se progredir");
		}
	}

	// ADICIONAR XP

	public void adicionarXP(double xpToAdd) {
		if (xpToAdd > 0)
			this.xpDoDev += xpToAdd;
		else
			throw new IllegalArgumentException("O XP não pode ser negativo");
	}

	// ADICIONAR ATIVIDADES/BOOTCAMP

	public void adicionarBootcampInscrito(Bootcamp e) {
		if (e == null)
			throw new IllegalArgumentException("A atividade concluida não pode ser null");
		this.bootcampsInscritos.add(e);

		for (Atividade o : e.getAtividadesDoBootcamp()){
			adicionarAtividadeInscrita(o);
		}
		e.getDevsInscritos().add(this);

	}

	public void adicionarAtividadeConcluida(Atividade e) {
		if (e == null)
			throw new IllegalArgumentException("A atividade concluida não pode ser null");
		this.atividadesConcluidas.add(e);
	}

	public void adicionarAtividadeInscrita(Atividade e) {
		if (e == null)
			throw new IllegalArgumentException("A atividade inscrita não pode ser null");
		this.atividadesInscritas.add(e);
	}

	// GETTERS

	public Double getXpDoDev() {
		return this.xpDoDev;
	}

	public Set<Bootcamp> getBootcampsInscritos() {
		return this.bootcampsInscritos;
	}

	public Set<Atividade> getAtividadesConcluidas() {
		return this.atividadesConcluidas;
	}

	public Set<Atividade> getAtividadesInscritas() {
		return this.atividadesInscritas;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Dev that = (Dev) o;
		return java.util.Objects.equals(nome, that.nome);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(nome);
	}

}