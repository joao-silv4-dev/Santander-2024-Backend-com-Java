import java.util.Objects;

public class Tarefa{
	private String descricao;
	private boolean statusConclusao;

	public Tarefa(String inputDescricao){
		if (inputDescricao!=null&&!inputDescricao.isEmpty()){
			this.descricao = inputDescricao;
			this.statusConclusao = false;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean getStatusConclusao() {
		return statusConclusao;
	}

	public void setStatusConclusao(boolean statusConclusao) {
		this.statusConclusao = statusConclusao;
	}

	@Override
	public int hashCode(){
		return Objects.hashCode(getDescricao());
	}

	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (!(o instanceof Tarefa tarefa)) return false;
		return tarefa.getDescricao()==getDescricao();
	}

	@Override
	public String toString(){

		if (this.statusConclusao) return "{ Tarefa"+System.lineSeparator()+
		"Descricao->"+this.descricao+System.lineSeparator()+
		"Status->Concluido"+System.lineSeparator()+"}";

		return "{ Tarefa"+System.lineSeparator()+
		"Descricao->"+this.descricao+System.lineSeparator()+
		"Status->Nao concluido"+System.lineSeparator()+"}";
	}

}