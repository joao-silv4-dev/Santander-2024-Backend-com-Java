import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}

	public void adicionarTarefa(String inputDescricao) {
		tarefaSet.add(new Tarefa(inputDescricao));
	}

	public void removerTarefa(String inputDescricao) {
		if (tarefaSet.size() > 0) {
			for (Tarefa e : tarefaSet) {
				if (e.getDescricao().equalsIgnoreCase(inputDescricao)) {
					tarefaSet.remove(e);
					break;
				}
			}
		}
	}

	public void exibirTarefas() {
		if (tarefaSet.size() > 0) {
			for (Tarefa e : tarefaSet) {
				System.out.println(e.toString());
			}
		}
	}

	public int contarTarefas() {
		return tarefaSet.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa e : this.tarefaSet) {
			if (e.getStatusConclusao()==true) {
				tarefasConcluidas.add(e);
			}
		}
		return tarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa e : tarefaSet) {
			if (!e.getStatusConclusao())
				tarefasPendentes.add(e);
		}
		return tarefasPendentes;
	}

	public void marcarTarefaConcluida(String inputDescricao) {
		if (tarefaSet.size() > 0) {
			for (Tarefa e : tarefaSet) {
				if (e.getDescricao().equalsIgnoreCase(inputDescricao)) {
					e.setStatusConclusao(true);
					System.out.println("Tarefa ->" + e.getDescricao());
					System.out.println("Marcada como concluida!");
					break;
				}
			}
		}
	}

	public void marcarTarefaPendente(String inputDescricao) {
		if (tarefaSet.size() > 0) {
			for (Tarefa e : tarefaSet) {
				if (e.getDescricao().equalsIgnoreCase(inputDescricao)) {
					e.setStatusConclusao(false);
					System.out.println("Tarefa ->" + e.getDescricao());
					System.out.println("Marcada como pendente!");
					break;
				}
			}
		}
	}

	public void limparListaTarefas() {
		if (tarefaSet.size() > 0) {
			for (Tarefa e : tarefaSet) {
				tarefaSet.remove(e);
			}
		}
	}

	public void exibirTarefa(String inputDescricao) {
		if (tarefaSet.size() > 0) {
			for (Tarefa e : tarefaSet) {
				if (e.getDescricao().equalsIgnoreCase(inputDescricao)) {
					System.out.println(e.toString());
					break;
				}
			}
		}
	}

	public void exibirLista(Set<Tarefa> list) {
		for (Tarefa e : list) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();

		listaTarefas.adicionarTarefa("tarefa1");
		listaTarefas.adicionarTarefa("tarefa2");
		listaTarefas.adicionarTarefa("tarefa3");
		listaTarefas.adicionarTarefa("tarefa4");
		listaTarefas.adicionarTarefa("tarefa5");

		listaTarefas.exibirTarefas();
		System.out.println("#################");
		System.out.println(listaTarefas.contarTarefas());
		System.out.println("#################");
		listaTarefas.removerTarefa("tarefa2");
		System.out.println("#################");
		listaTarefas.exibirTarefas();
		System.out.println("#################");
		listaTarefas.marcarTarefaConcluida("tarefa1");
		listaTarefas.exibirTarefa("tarefa1");
		System.out.println("#################");
		Set<Tarefa> tarefasConcluidas = listaTarefas.obterTarefasConcluidas();

		for (Tarefa e : tarefasConcluidas) {
			System.out.println(e.toString());
		}

		System.out.println("#################");
		listaTarefas.limparListaTarefas();
		System.out.println(listaTarefas.contarTarefas());

	}
}