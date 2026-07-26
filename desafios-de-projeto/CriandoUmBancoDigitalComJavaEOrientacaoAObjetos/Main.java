import models.Banco;
import models.Cliente;
import models.Corrente;
import models.Poupanca;

public class Main {
	public static void main(String[] args) {

		try {
			Banco banco = new Banco();

			Cliente jose = new Cliente("Jose Verissimo", 20);
			Cliente carla = new Cliente("Carla Josefina", 21);

			Poupanca poupanca = new Poupanca(1234, 1001, jose);
			Corrente corrente = new Corrente(1234, 1002, carla);
			banco.adicionarConta(poupanca);
			banco.adicionarConta(corrente);

			for (int i = 1; i <= 4; i++) {
				System.out.println("===== ACAO " + i + " =====");
				switch (i) {
					case 1:
						try {
							corrente.deposito(200);
							banco.adicionarHistorico(corrente, null, "deposito", 200d);
						} catch (Exception e) {
							System.out.println("Err: " + e);
						}
						break;
					case 2:
						try {
							corrente.transferencia(100, poupanca);
							banco.adicionarHistorico(corrente, poupanca, "transferencia", 100d);
						} catch (Exception e) {
							System.out.println("Err: " + e);
						}
						break;
					case 3:
						try {
							banco.getTransacoes().forEach(System.out::println);
						} catch (Exception e) {
							System.out.println("Err: " + e);
						}
						break;
					case 4:
						banco.imprimirTodasContas();
						break;
					default:
						break;
				}
			}
		} catch (Exception e) {
			System.out.println("Err: " + e);
		}

	}
}