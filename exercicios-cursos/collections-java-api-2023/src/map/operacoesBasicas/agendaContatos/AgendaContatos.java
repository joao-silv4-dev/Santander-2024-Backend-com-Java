import java.util.HashMap;
import java.util.Map;

public class AgendaContatos{
	private Map<String, Integer> contatosMap;

	public AgendaContatos(){
		contatosMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone){
		this.contatosMap.put(nome.toLowerCase(), telefone);
	}

	public void removerContato(String nome){
		if (this.contatosMap.containsKey(nome.toLowerCase())){
			this.contatosMap.remove(nome.toLowerCase());
		} else System.out.println("Não encontrado!");
	}

	public void exibirContatos(){
		if (!this.contatosMap.isEmpty()){
			for (String keys : contatosMap.keySet()){
				System.out.println("Nome->"+keys.toLowerCase());
				System.out.println("Telefone->"+contatosMap.get(keys.toLowerCase())+System.lineSeparator());
			}
		}
	}

	public void pesquisarPorNome(String nome){
		if (!this.contatosMap.isEmpty() && contatosMap.containsKey(nome.toLowerCase())){
			System.out.println("Nome->"+nome.toLowerCase());
			System.out.println("Telefone->"+contatosMap.get(nome.toLowerCase()));
		} else System.out.println("Contato não encontrado");
	}

}