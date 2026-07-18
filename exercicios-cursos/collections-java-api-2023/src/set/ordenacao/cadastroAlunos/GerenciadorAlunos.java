import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;

public class GerenciadorAlunos{
	private Set<Aluno> alunoSet;

	public GerenciadorAlunos(){
		this.alunoSet = new HashSet<>();
	}

	public void adicionarAluno(String inputNome, long inputMatricula, double inputMedia){
		if (inputNome!=null && !inputNome.isEmpty()){
			alunoSet.add(new Aluno(inputNome, inputMatricula, inputMedia));
		}
	}

	public void removerAluno(long inputMatricula){
		if (!this.alunoSet.isEmpty()){
			for (Aluno e : alunoSet){
				if (e.getMatricula()==inputMatricula){
					alunoSet.remove(e);
					break;
				}
			}
		}
	}

	public Set<Aluno> exibirAlunosPorNome(){
		if (!this.alunoSet.isEmpty()){
			Set<Aluno> ordenadaPorNome = new TreeSet<>(this.alunoSet);
			return ordenadaPorNome;
		}
		return null;
	}

	public Set<Aluno> exibirAlunosPorNota(){
		if (!this.alunoSet.isEmpty()){
			Set<Aluno> ordenadaPorNota = new TreeSet<>(new OrdenadaPorNota());
			ordenadaPorNota.addAll(this.alunoSet);
			return ordenadaPorNota;
		}
		return null;
	}

	public Set<Aluno> exibirAlunos(){
		if (!this.alunoSet.isEmpty()){
			return this.alunoSet;
		}
		return null;
	}

}

class OrdenadaPorNota implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return Double.compare(o1.getNota(), o2.getNota());
	}

}