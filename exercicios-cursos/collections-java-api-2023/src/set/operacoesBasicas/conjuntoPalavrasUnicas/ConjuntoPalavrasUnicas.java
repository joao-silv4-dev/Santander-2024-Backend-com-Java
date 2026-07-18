import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavrasSet;
	private String palavra;

	public ConjuntoPalavrasUnicas() {
		palavrasSet = new HashSet<>();
	}

	public String getPalavra(){
		return this.palavra;
	}

	public void atualizarPalavra(String palavra){
		this.palavra = null;
		for (String e : palavrasSet){
			if (e.equals(palavra)){
				this.palavra = e;
			}
		}
	}

	@Override
	public int hashCode(){
		return Objects.hash(getPalavra());
	}

	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (!(o instanceof String e)) return false;
		return getPalavra() == e;
	}

	public void adicionarPalavra(String inputPalavra) {
		if (inputPalavra != null && !inputPalavra.isEmpty())
			palavrasSet.add(inputPalavra);
	}

	public void removerPalavra(String inputPalavra) {
		String palavraDescartar = null;

		for (String e : palavrasSet) {
			if (e.equals(inputPalavra)) {
				palavraDescartar = inputPalavra;
				break;
			}
		}

		palavrasSet.remove(palavraDescartar);
	}

	public void verificarPalavra(String inputPalavra) {
		boolean presente = false;
		for (String e : palavrasSet) {
			if (e.equals(inputPalavra)) {
				System.out.println("Palavra está presente!");
				presente = true;
				break;
			}
		}
		if (!presente) {
			System.out.println("Palavra não está presente!");
		}
	}

	public void exibirPalavrasUnicas() {
		for (String e : palavrasSet) {
			System.out.println(e + System.lineSeparator());
		}
	}

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

		conjuntoPalavras.adicionarPalavra("palavra1");
		conjuntoPalavras.adicionarPalavra("palavra2");
		conjuntoPalavras.adicionarPalavra("palavra2");
		conjuntoPalavras.adicionarPalavra("palavra3");

		conjuntoPalavras.exibirPalavrasUnicas();

	}

}