public class Aluno implements Comparable<Aluno>{
	private String nome;
	private long matricula;
	private double nota;

	public Aluno (String inputNome, long inputMatricula, double inputNota){
		if (inputNome!=null && !inputNome.isEmpty()){
			this.nome = inputNome;
			this.matricula = inputMatricula;
			this.nota = inputNota;
		}
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public boolean equals(Object o){
		if (this==o) return true;
		if (!(o instanceof Aluno aluno)) return false;
		return getMatricula()==aluno.getMatricula();
	}

	@Override
	public int hashCode(){
		return Long.hashCode(getMatricula());
	}

	@Override
	public String toString(){
		return "Aluno {"+System.lineSeparator()+
		"	Nome->"+this.nome+System.lineSeparator()+
		"	Matricula->"+this.matricula+System.lineSeparator()+
		"	Média da nota->"+this.nota+System.lineSeparator()+"}";
	}

	@Override
	public int compareTo(Aluno o) {
		return this.getNome().compareToIgnoreCase(o.getNome());
	}

}