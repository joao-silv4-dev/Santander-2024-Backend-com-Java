package dio.desafio.abstraindoBootcampUsandoPOO.model;

import java.time.LocalDateTime;

public class Mentoria extends Atividade {

	private LocalDateTime data;

	public Mentoria(String inputTitulo, String inputDescricao, LocalDateTime inputData) {
		super(inputTitulo, inputDescricao);
		if (inputData != null)
			this.data = inputData;
		else
			throw new IllegalArgumentException("A data não pode ser null!");
	}

	public LocalDateTime getData() {
		return data;
	}

	@Override
	public String toString() {
		return "{ Mentoria" + System.lineSeparator() + "Titulo: " + this.getTitulo() +
				System.lineSeparator() + "Descricao: " + this.getDescricao() + System.lineSeparator() +
				"Data: " + this.getData() + System.lineSeparator() + "XP Ganho: " + calcularXP() +
				System.lineSeparator() + "}";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

}