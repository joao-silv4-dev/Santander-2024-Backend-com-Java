import iphone.Iphone;

public class Main{
	public static void main(String[] args) {
		Iphone iphone = new Iphone();

		iphone.ligar("4002-8922");
		iphone.atender();
		iphone.iniciarCorreioVoz();

		System.out.println();

		iphone.adicionarNovaAba();
		iphone.exibirPagina("site 100% seguro");
		iphone.atualizarPagina();

		System.out.println();

		iphone.selecionarMusica("The weeknd - Earned It");
		iphone.tocar();
		iphone.pausar();

	}
}