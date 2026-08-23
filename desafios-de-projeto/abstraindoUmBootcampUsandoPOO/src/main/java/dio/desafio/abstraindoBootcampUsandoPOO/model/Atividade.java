package dio.desafio.abstraindoBootcampUsandoPOO.model;

public abstract class Atividade {

	private String titulo;
	private String descricao;

	protected static final double XP_PADRAO = 10d;

	private boolean verificarString(String e) {
		if (!e.isEmpty() && e != null)
			return true;
		else
			return false;
	}

	public Atividade(String inputTitulo, String inputDescricao) {
		if (verificarString(inputTitulo))
			this.titulo = inputTitulo;
		else
			throw new IllegalArgumentException("O titulo deve conter algo e ser diferente de null!");
		if (verificarString(inputDescricao))
			this.descricao = inputDescricao;
		else
			throw new IllegalArgumentException("A descrição deve conter algo e ser diferente de null!");
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public abstract double calcularXP();

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Atividade that = (Atividade) o;
		return java.util.Objects.equals(titulo, that.titulo);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(titulo);
	}

}