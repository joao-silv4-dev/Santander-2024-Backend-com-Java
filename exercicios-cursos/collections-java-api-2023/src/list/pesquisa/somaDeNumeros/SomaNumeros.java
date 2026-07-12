import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{

	private List<Integer> listaNumeros;

	public SomaNumeros(){
		this.listaNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero){
		this.listaNumeros.add(numero);
	}

	public int calcularSoma(){
		int total = 0;
		for (int i=0; i<listaNumeros.size();i++){
			total = total + listaNumeros.get(i);
		}
		return total;
	}

	public int encontrarMaiorNumero(){
		int maiorNumero = listaNumeros.get(0);
		for (int i=0; i<listaNumeros.size();i++){
			if (maiorNumero<=listaNumeros.get(i)){
				maiorNumero = listaNumeros.get(i);
			}
		}
		return maiorNumero;
	}

	public int encontrarMenorNumero(){
		int menorNumero = listaNumeros.get(0);
		for (int i=0; i<listaNumeros.size();i++){
			if (menorNumero>=listaNumeros.get(i)){
				menorNumero = listaNumeros.get(i);
			}
		}
		return menorNumero;
	}

	public void exibirNumeros(){
		if (listaNumeros.size()>0){
			for(int i = 0; i<listaNumeros.size(); i++){
				System.out.println(listaNumeros.get(i));
			}
		}
	}
}