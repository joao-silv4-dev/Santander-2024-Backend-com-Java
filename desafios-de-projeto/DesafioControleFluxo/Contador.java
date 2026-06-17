import java.util.Scanner;

public class Contador{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int p1 = input.nextInt();
		
		System.out.print("Digite o segundo parâmetro: ");
		int p2 = input.nextInt();

		try {
			contar(p1,p2);
		} 
		
		catch(ParametrosInvalidosException e){
			System.out.println("Erro: " + e);
		} 
		
		finally {
			System.out.println("Codigo finalizado!");
		}

	}

	static void contar(int n1, int n2) throws ParametrosInvalidosException{
		int contagem = n2-n1;

		if (contagem<0){
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
		} else if (contagem==0){
			throw new ParametrosInvalidosException("Os dois numeros não podem ser iguais!");
		} else {
			for (int x=0;x<=contagem;x++){
				System.out.println("Imprimindo o número "+ x);
			}
		}
	}

}

class ParametrosInvalidosException extends Exception{
	public ParametrosInvalidosException(String msg){
		super(msg);
	}
}
