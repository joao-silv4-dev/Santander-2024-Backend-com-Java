import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras{
	private Map<String, Integer> palavrasMap;

	public ContagemPalavras(){
		this.palavrasMap = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, Integer contagem){
		this.palavrasMap.put(palavra, contagem);
	}

	public void removerPalavra(String palavra){
		if (!this.palavrasMap.isEmpty()&&this.palavrasMap.containsKey(palavra)){
			this.palavrasMap.remove(palavra);
		} else System.out.println("Err: Palavra inexistente ou lista vazia");
	}

	public void exibirContagemPalavras(){
		if (!this.palavrasMap.isEmpty()){
			for (String e : this.palavrasMap.keySet()){
				System.out.println("Palavra->"+e+System.lineSeparator()+
					"Contagem->"+this.palavrasMap.get(e)+System.lineSeparator());
			}
		} else System.out.println("Lista vazia");
	}

	public void encontrarPalavraMaisFrequente(){

		if (!this.palavrasMap.isEmpty()){
			String palavraFrequente = "";
			int contagemPalavra = 0;
			
			for (String e : this.palavrasMap.keySet()){
				
				if (this.palavrasMap.get(e)>contagemPalavra){
					palavraFrequente = e;
					contagemPalavra = this.palavrasMap.get(e);
				}
				
			}

			System.out.println("Palavra com maior contagem:"+System.lineSeparator()+
					"	Palavra->"+palavraFrequente+System.lineSeparator()+
					"	Contagem->"+this.palavrasMap.get(palavraFrequente)+System.lineSeparator());

		} else System.out.println("Lista vazia");
	}
}