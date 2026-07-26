package models;

public class Poupanca extends Conta {
	public Poupanca(int inputAgencia, int inputNumero, Cliente cliente) {
		super(inputAgencia, inputNumero, cliente);
		this.tipoDeConta = "Poupanca";
	}

}