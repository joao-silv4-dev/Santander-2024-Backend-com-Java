import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas{

	private List<Pessoa> pessoasList;

	public OrdenacaoPessoas(){
		this.pessoasList = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura){
		pessoasList.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> ordenadaPorAltura = new ArrayList<>(pessoasList);
		Collections.sort(ordenadaPorAltura, new ComparatorPorAltura());
		return ordenadaPorAltura;
	}

	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> ordenadaPorIdade = new ArrayList<>(pessoasList);
		Collections.sort(ordenadaPorIdade);
		return ordenadaPorIdade;
	}

	public void mostrarTudo(List<Pessoa> list){
		for (Pessoa e : list){
			System.out.println("Nome: "+e.getNome());
			System.out.println("Idade: "+e.getIdade());
			System.out.println("Altura: "+e.getAltura());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

		ordenacaoPessoas.adicionarPessoa("Pessoa 1", 20, 1.70);
		ordenacaoPessoas.adicionarPessoa("Pessoa 2", 20, 1.80);
		ordenacaoPessoas.adicionarPessoa("Pessoa 3", 22, 1.20);
		ordenacaoPessoas.adicionarPessoa("Pessoa 4", 17, 1.50);

		List<Pessoa> ordenada = ordenacaoPessoas.ordenarPorAltura();
		ordenacaoPessoas.mostrarTudo(ordenada);

	}

}

class ComparatorPorAltura implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}

}