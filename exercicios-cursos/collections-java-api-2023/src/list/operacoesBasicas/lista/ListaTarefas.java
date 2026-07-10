package list.operacoesBasicas.lista;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefa> ListaTarefas;

	public boolean estaVazio(String e) {

		if (e != null && !e.isEmpty())
			return true;
		return false;
	}

	public ListaTarefas() {
		this.ListaTarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String tarefaAdd) {
		if (estaVazio(tarefaAdd))
			this.ListaTarefas.add(new Tarefa(tarefaAdd));
	}

	public void removerTarefa(String tarefaRemove) {
		if (estaVazio(tarefaRemove))
			ListaTarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(tarefaRemove));
	}

	public int obterNumeroTotalTarefas() {
		return ListaTarefas.size();
	}

	public List<String> obterDescricoesTarefas() {
		List<String> descricoesTarefas = new ArrayList<>();
		for (Tarefa e : ListaTarefas) {
			descricoesTarefas.add(e.getDescricao());
		}
		return descricoesTarefas;

	}

}