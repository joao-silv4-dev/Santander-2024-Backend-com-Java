package models;

public abstract class Conta {
	private int agencia;
	private int numero;
	protected String tipoDeConta;
	protected Cliente cliente;
	private double saldo;

	public Conta(int inputAgencia, int inputNumero, Cliente cliente) {
		if (inputAgencia<0) throw new IllegalArgumentException("A Agencia precisa ser maior que 0");
		if (inputNumero<0) throw new IllegalArgumentException("O Numero precisa ser maior que 0");
		if (cliente==null) throw new NullPointerException("O cliente nao pode ser Null");

		this.agencia = inputAgencia;
		this.numero = inputNumero;
		this.cliente = cliente;
		this.saldo = 0;
		
	}

	public int getAgencia(){
		return this.agencia;
	}

	public int getNumero(){
		return this.numero;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public Cliente getCliente(){
		return this.cliente;
	}

	public void deposito(double valorDeposito) {
		if (valorDeposito > 0) {
			this.saldo = this.saldo + valorDeposito;
		} else throw new IllegalArgumentException("Valor invalido.");
	}

	public void saque(double valorSaque) throws SaldoInsuficienteException{
		if (valorSaque > 0 && valorSaque <= this.saldo) {
			this.saldo -= valorSaque;
		} else throw new SaldoInsuficienteException("Saldo insuficiente para o saque.");
	}

	public void transferencia(double valorTransferencia, Conta conta) throws SaldoInsuficienteException {
		if (valorTransferencia > 0 && valorTransferencia <= this.saldo && conta != null) {
			conta.deposito(valorTransferencia);
			this.saldo -= valorTransferencia;
		}else throw new SaldoInsuficienteException("Saldo insuficiente para a transferencia.");
	}

	public void imprimirExtrato() {
		System.out.println("Conta {" + System.lineSeparator() +
				"	Nome: " + cliente.getNome() + System.lineSeparator() +
				"	Idade: " + cliente.getIdade() + System.lineSeparator() +
				"	Agencia: " + this.agencia + System.lineSeparator() +
				"	Numero: " + this.numero + System.lineSeparator() +
				"	Tipo de conta: " + this.tipoDeConta + System.lineSeparator() +
				"	Saldo: " + this.saldo + System.lineSeparator() + "}");
	}
}

class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String msg){
		super(msg);
	}
}