import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros{
	private List<Integer> numerosList;
	private int index;


	public OrdenacaoNumeros(){
		this.numerosList = new ArrayList<>();
	}

	public void adicionarNumero(int numero){
		this.numerosList.add(numero);
	}

	public List<Integer> ordenarAscendente(){
		List<Integer> listAscendente = new ArrayList<>(numerosList);
		Collections.sort(listAscendente);
		return listAscendente;
	}

	public List<Integer> ordenarDescendente(){
		List<Integer> listDescendente = new ArrayList<>(numerosList);
		Collections.sort(listDescendente, Collections.reverseOrder());
		return listDescendente;
	}

	public Integer getNumber(List<Integer> list, int index){
		this.index = index;
		return list.get(this.index);
	}

	public List<Integer> getLista(){
		return this.numerosList;
	}

}