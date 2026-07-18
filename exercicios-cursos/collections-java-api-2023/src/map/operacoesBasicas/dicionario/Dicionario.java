import java.util.HashMap;
import java.util.Map;
import java.util.jar.Manifest;

public class Dicionario{
	private Map<String, String> dicionario;

	public Dicionario(){
		this.dicionario = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, String definicao){
		if (palavra!=null&&!palavra.isEmpty() && definicao!=null&&!definicao.isEmpty() ){
			dicionario.put(palavra, definicao);
		}
	}

	public void removerPalavra(String palavra){
		if (!dicionario.isEmpty() && palavra!=null && !palavra.isEmpty())
			dicionario.remove(palavra);
	}

	public void exibirPalavras(){
		if (!dicionario.isEmpty()){
			for (String keys : dicionario.keySet()){
				System.out.println("Palavra->"+keys);
				System.out.println("Definição->"+dicionario.get(keys)+System.lineSeparator());
			}
		}
	}

	public void pesquisarPorPalavra(String palavra){
		if (!dicionario.isEmpty()){
			System.out.println("Palavra->"+palavra);
			System.out.println(("Definição->")+dicionario.get(palavra)+System.lineSeparator());
		}
	}

}