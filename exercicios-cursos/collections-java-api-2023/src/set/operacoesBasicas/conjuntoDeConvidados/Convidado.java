import java.util.Objects;

public class Convidado{
	// atributos

	private String nome;
	private int codigoConvite;

	public Convidado(String inputNome, int inputCodigoConvite){
		if (inputNome!=null&&!inputNome.isEmpty() && inputCodigoConvite>0){
			this.nome = inputNome;
			this.codigoConvite = inputCodigoConvite;
		}
	}

	public String getNome(){
		return this.nome;
	}

	public int getCodigoConvite(){
		return this.codigoConvite;
	}

	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (!(o instanceof Convidado convidado))return false;
		return getCodigoConvite() == convidado.getCodigoConvite();
	}

	@Override
	public int hashCode(){
		return Objects.hashCode(getCodigoConvite());
	}

	@Override
	public String toString(){
		return "Convidado{"+System.lineSeparator()+
			"Nome="+nome+","+System.lineSeparator()+
			" Codigo do Convite="+codigoConvite+System.lineSeparator()+
		"}";
	}


}