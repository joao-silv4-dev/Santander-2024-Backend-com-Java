import java.util.Objects;

public class Contato{
	private String nome;
	private int numeroTelefone;

	public Contato(String inputNome, int inputNumeroTelefone){
		if (inputNome!=null && !inputNome.isEmpty()){
			this.nome = inputNome;
			this.numeroTelefone = inputNumeroTelefone;
		}
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int inputNumero){
		this.numeroTelefone = inputNumero;
	}

	@Override
	public String toString(){
		return "{Contato"+System.lineSeparator()+
			"Nome->"+this.nome+System.lineSeparator()+
			"Numero de telefone->"+this.numeroTelefone+System.lineSeparator()+
		"}";
	}

	@Override
	public int hashCode(){
		return Objects.hash(getNumeroTelefone());
	}

	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (!(o instanceof Contato contato)) return false;
		return getNumeroTelefone() == contato.getNumeroTelefone();
	}

}