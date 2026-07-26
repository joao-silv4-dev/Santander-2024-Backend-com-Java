package models;

public class Corrente extends Conta {

	public Corrente(int inputAgencia, int inputNumero, Cliente cliente) {
		super(inputAgencia, inputNumero, cliente);
		this.tipoDeConta = "Corrente";
	}

}