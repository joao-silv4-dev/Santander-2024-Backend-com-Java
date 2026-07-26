package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contasList;
	private List<String> historicoTransacao;

	public Banco() {
		this.nome = "Nubake";
		this.contasList = new ArrayList<>();
		this.historicoTransacao = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public List<Conta> getContas() {
		return new ArrayList<>(this.contasList);
	}

	public void adicionarConta(Conta conta) {
		if (conta != null) {
			this.contasList.add(conta);
		}
	}

	public int numeroContas() {
		return this.contasList.size();
	}

	public void imprimirTodasContas() {
		contasList.stream().forEach(conta -> conta.imprimirExtrato());
	}

	public void adicionarHistorico(
			Conta contaAcao, Conta contaDestinataria, String acao, Double valor) {
		if (acao != null && !acao.isEmpty()) {
			switch (acao) {
				case "deposito":
					if (contaAcao != null) {
						this.historicoTransacao.add("DEPOSITO {" + System.lineSeparator() +
								"	Nome do cliente: " + contaAcao.getCliente().getNome() + System.lineSeparator() +
								"	Agencia: " + contaAcao.getAgencia() + System.lineSeparator() +
								"	Numero da conta: " + contaAcao.getNumero() + System.lineSeparator() +
								"	Valor: " + valor + System.lineSeparator() +
								"	Saldo: " + contaAcao.getSaldo() + System.lineSeparator() + "}");
					}
					break;
				case "saque":
					if (contaAcao != null) {
						this.historicoTransacao.add("SAQUE {" + System.lineSeparator() +
								"	Nome do cliente: " + contaAcao.getCliente().getNome() + System.lineSeparator() +
								"	Agencia: " + contaAcao.getAgencia() + System.lineSeparator() +
								"	Numero da conta: " + contaAcao.getNumero() + System.lineSeparator() +
								"	Valor: " + valor + System.lineSeparator() +
								"	Saldo: " + contaAcao.getSaldo() + System.lineSeparator() + "}");
					}
					break;
				case "transferencia":
					if (contaAcao != null && contaDestinataria != null) {
						this.historicoTransacao.add("TRANSFERENCIA {" + System.lineSeparator() +
								"	DE-> Nome do cliente: " + contaAcao.getCliente().getNome() + System.lineSeparator()
								+
								"	Agencia: " + contaAcao.getAgencia() + System.lineSeparator() +
								"	Numero da conta: " + contaAcao.getNumero() + System.lineSeparator() +
								"	Valor: " + valor + System.lineSeparator() +
								"	Saldo: " + contaAcao.getSaldo() + System.lineSeparator() +
								"	PARA-> Nome do cliente: " + contaDestinataria.getCliente().getNome()
								+ System.lineSeparator() +
								"	Agencia: " + contaDestinataria.getAgencia() + System.lineSeparator() +
								"	Numero da conta: " + contaDestinataria.getNumero() + System.lineSeparator() +
								"	Saldo: " + contaDestinataria.getSaldo() + System.lineSeparator() + "}");
					}
					break;
				default:
					break;
			}
		}
	}

	public List<String> getTransacoes() {
		return new ArrayList<>(this.historicoTransacao);
	}

}