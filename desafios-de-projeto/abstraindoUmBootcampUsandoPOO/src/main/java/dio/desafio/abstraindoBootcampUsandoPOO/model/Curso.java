package dio.desafio.abstraindoBootcampUsandoPOO.model;

public class Curso extends Atividade {

	private int cargoHoraria;

	public Curso(String inputTitulo, String inputDescricao, int inputCargoHoraria) {
		super(inputTitulo, inputDescricao);
		if (inputCargoHoraria > 0)
			this.cargoHoraria = inputCargoHoraria;
		else
			throw new IllegalArgumentException("A cargo horária não pode ser negativa!");
	}

	public int getCargoHoraria() {
		return cargoHoraria;
	}

	@Override
	public String toString() {
		return "{ Curso" + System.lineSeparator() + "Titulo: " + this.getTitulo() +
				System.lineSeparator() + "Descricao: " + this.getDescricao() + System.lineSeparator() +
				"Cargo horária: " + this.getCargoHoraria() + " horas" + System.lineSeparator() +
				"XP Ganho: " + calcularXP() + System.lineSeparator() + "}";
	}

	@Override
	public double calcularXP() {
		return (getCargoHoraria() * 10d) + XP_PADRAO;
	}

}