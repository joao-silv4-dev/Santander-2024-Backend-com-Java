package list.operacoesBasicas.lista;

public class Tarefa{
	private String descricao;

	public Tarefa(String descricaoInput){
		if (descricaoInput != null && !descricaoInput.isEmpty())
			this.descricao = descricaoInput;
	}

	public String getDescricao(){
		return this.descricao;
	}
}