import java.util.List;
import java.util.Scanner;

import list.operacoesBasicas.lista.*;
import list.operacoesBasicas.carrinhoDeCompras.*;

public class Main {

	// Lista tarefas
	static ListaTarefas listaTarefas = new ListaTarefas();
	static List<String> listaDescricaoTarefas;
	static int totalTarefas;

	// Carrinho de compras
	static CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
	static double valorTotal;

	// Sistema
	static Scanner scanner = new Scanner(System.in);
	static String inputString = null;
	static double inputDouble = 0;
	static int inputInt = -1;

	public static void main(String[] args) {
		boolean system = true;

		String page = "main";

		while (system) {

			while (page.equals("mainCarrinhoCompras")) {
				System.out.println("###########################################" + System.lineSeparator());
				System.out.println("Escolha uma das seguintes opcoes abaixo.");
				System.out.println("1 - Sair");
				System.out.println("2 - Voltar");
				System.out.println("3 - Adicionar item");
				System.out.println("4 - Remover item");
				System.out.println("5 - Exibir itens");
				System.out.println("6 - Calcular o valor total" + System.lineSeparator());

				try {
					System.out.print("# ");
					inputInt = scanner.nextInt();
					scanner.nextLine();
				} catch (Exception e) {
					System.out.println("Insira apenas numeros!");
				}

				switch (inputInt) {
					case 1:
						system = false;
						page = "exit";
						break;
					case 2:
						page = "main";
						break;
					case 3:

						// Pegando nome
						try{
							System.out.print("Insira o nome do item: ");
							inputString = scanner.nextLine();
						}
						catch (Exception e){
							System.out.println("Err: " + e);
						}
						
						// Pegando preco
						try{
							System.out.print("Insira o preco do Item: ");
							inputDouble = scanner.nextDouble();
							scanner.nextLine();
						}
						catch (Exception e){
							System.out.println("Err: " + e);
						}

						// Pegando a quantidade
						try{
							System.out.print("Insira a quantidade do item: ");
							inputInt = scanner.nextInt();
							scanner.nextLine();
						}
						catch (Exception e){
							System.out.println("Err: " + e);
						}

						// Adicionando o item ao carrinho
						try{
							carrinhoDeCompras.adicionarItem(
								inputString, inputDouble, inputInt
							);
						}
						catch (Exception e){
							System.out.println("Err: "+ e );
						}
						break;
					case 4:
						// removendo item
						try {
							System.out.print("Insira o nome do item que deseja excluir: ");
							inputString = scanner.nextLine();
						}
						catch (Exception e){
							System.out.println("Err: "+e);
						}

						carrinhoDeCompras.removerItem(inputString);
						break;
					case 5:
						// exibindo itens no carrinho
						carrinhoDeCompras.exibirItens();
						break;
					case 6:
						// calculando e mostrando o valor total
						valorTotal = carrinhoDeCompras.calcularValorTotal();
						System.out.println("O valor total e "+valorTotal);
						break;
					default:
						System.out.println("Insira uma opcao valida!");
						break;
				}
			}

			while (page.equals("mainListaTarefas")) {
				System.out.println("###########################################" + System.lineSeparator());
				System.out.println("Escolha uma das seguintes opcoes abaixo.");
				System.out.println("1 - Sair");
				System.out.println("2 - Voltar");
				System.out.println("3 - Adicionar tarefa");
				System.out.println("4 - Remover tarefa");
				System.out.println("5 - Mostrar tarefas");
				System.out.println("6 - Mostrar numero total de tarefa" + System.lineSeparator());

				try {
					System.out.print("# ");
					inputInt = scanner.nextInt();
					scanner.nextLine();
				} catch (Exception e) {
					System.out.println("Insira apenas numeros!");
				}

				switch (inputInt) {
					case 1:
						system = false;
						page = "exit";
						break;

					case 2:
						page = "main";
						break;

					case 3:
						System.out.print("Escreva a tarefa a ser adicionada: ");
						inputString = scanner.nextLine();

						if (listaTarefas.estaVazio(inputString)) {
							listaTarefas.adicionarTarefa(inputString);
						}
						break;

					case 4:
						System.out.print("Escreva a tarefa a ser removida: ");
						inputString = scanner.nextLine();

						try {
							listaTarefas.removerTarefa(inputString);
						} catch (Exception e) {
							System.out.println("Err: " + e);
						}
						break;

					case 5:
						listaDescricaoTarefas = listaTarefas.obterDescricoesTarefas();

						for (int i = 0; i < listaDescricaoTarefas.size(); i++) {
							System.out.println("Tarefa " + (i + 1) + ": " + listaDescricaoTarefas.get(i));
						}

						break;

					case 6:
						totalTarefas = listaTarefas.obterNumeroTotalTarefas();
						System.out.println(totalTarefas);
						break;

					default:
						System.out.println("Insira uma opcao valida!");
						break;
				}

			}

			while (page.equals("main")) {

				System.out.println("###########################################" + System.lineSeparator());
				System.out.println("Escolha uma das seguintes opcoes abaixo.");
				System.out.println("1 - Sair");
				System.out.println("2 - Lista de tarefas");
				System.out.println("3 - Carrinho de compras" + System.lineSeparator());

				try {
					System.out.print("# ");
					inputInt = scanner.nextInt();
					scanner.nextLine();
				} catch (Exception e) {
					System.out.println("Insira apenas numeros!");
				}

				switch (inputInt) {
					case 1:
						system = false;
						page = "exit";
						break;
					case 2:
						page = "mainListaTarefas";
						break;
					case 3:
						page = "mainCarrinhoCompras";
						break;

					default:
						System.out.println("Insira uma opcao valida!");
						break;
				}

			}
		}
	}
}
