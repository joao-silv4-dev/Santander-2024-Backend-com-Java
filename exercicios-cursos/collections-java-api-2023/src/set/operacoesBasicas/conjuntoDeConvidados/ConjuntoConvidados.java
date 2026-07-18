import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados{
	private Set<Convidado> convidadosSet;

	public ConjuntoConvidados(){
		this.convidadosSet = new HashSet<>();
	}

	public void adicionarConvidado(String inputNome, int inputCodigoConvite){
		if (inputNome!=null && !inputNome.isEmpty() && inputCodigoConvite>0)
			convidadosSet.add(new Convidado(inputNome, inputCodigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int inputCodigoConvite){
		Convidado convidadoDescartar = null;
		for (Convidado e : convidadosSet){
			if (e.getCodigoConvite()==inputCodigoConvite){
				convidadoDescartar = e;
				break;
			}
		}
		convidadosSet.remove(convidadoDescartar);
	}

	public int contarConvidados(){
		return convidadosSet.size();
	}

	public void exibirConvidados(){
		for (Convidado e : convidadosSet){
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args){
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

		conjuntoConvidados.adicionarConvidado("P. diddy", 123);
		conjuntoConvidados.adicionarConvidado("Jeffrey Epstein", 456);
		conjuntoConvidados.adicionarConvidado("Shaquille O'Neal", 789);
		conjuntoConvidados.adicionarConvidado("Stephen Hawking", 103);

		conjuntoConvidados.exibirConvidados();
		System.out.println("Numero de convidados: "+conjuntoConvidados.contarConvidados());
		System.out.println("###################");
		conjuntoConvidados.removerConvidadoPorCodigoConvite(456);
		conjuntoConvidados.exibirConvidados();
		System.out.println("Numero de convidados: "+conjuntoConvidados.contarConvidados());
		
	}
}