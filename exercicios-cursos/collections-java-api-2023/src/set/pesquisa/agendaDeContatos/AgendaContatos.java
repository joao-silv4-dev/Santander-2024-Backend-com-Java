import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
	private Set<Contato> contatosSet;

	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}

	public void adicionarContato(String inputNome, int inputNumero) {
		if (inputNome != null && !inputNome.isEmpty()) {
			contatosSet.add(new Contato(inputNome, inputNumero));
		} else
			System.out.println("Nao foi possivel adicionar o contato");
	}

	public void exibirContatos() {
		if (contatosSet.size() > 0) {
			for (Contato e : contatosSet) {
				System.out.println(e.toString());
			}
		} else
			System.out.println("Lista vazia");
	}

	public void pesquisarPorNome(String inputNome) {
		if (contatosSet.size() > 0) {
			for (Contato e : contatosSet) {
				if ((e.getNome().toLowerCase()).startsWith(inputNome.toLowerCase())) {
					System.out.println("Contato achado!");
					System.out.println(e.toString());
				}
			}
		} else
			System.out.println("Lista vazia");

	}

	public void atualizarNumeroContato(String inputNome, int novoNumero) {
		if (contatosSet.size() > 0) {
			for (Contato e : contatosSet) {
				if (e.getNome().equalsIgnoreCase(inputNome)) {
					e.setNumeroTelefone(novoNumero);
					System.out.println("Contato atualizado!");
					System.out.println(e.toString());
					break;
				}
			}
		} else
			System.out.println("Lista vazia");
	}

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

		agendaContatos.adicionarContato("contato1", 1234);
		agendaContatos.adicionarContato("contato2", 1235);
		agendaContatos.adicionarContato("contato3", 1236);
		agendaContatos.adicionarContato("contato4", 1237);
		agendaContatos.adicionarContato("contato5", 1238);

		agendaContatos.exibirContatos();
		System.out.println("##############");
		agendaContatos.pesquisarPorNome("contato2");
		System.out.println("##############");
		agendaContatos.atualizarNumeroContato("contato2", 1800);
		System.out.println("##############");
		agendaContatos.exibirContatos();
	}
}