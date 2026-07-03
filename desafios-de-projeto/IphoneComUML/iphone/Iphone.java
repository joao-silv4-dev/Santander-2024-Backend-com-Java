package iphone;

import functions.*;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	// Reprodutor musical
	String musicaSelecionada;
	boolean tocandoMusica = false;

	// Navegador Internet
	String url;
	boolean dentroDePagina = false;

	// Aparelho Telefonico
	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
	}

	public void atender() {
		System.out.println("Atendendo ligação");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}


	// Navegador de Internet
	public void exibirPagina(String url) {
		if ( url != null && !url.isEmpty()){
			System.out.println("Exibindo a pagina: " + url);
			this.url = url;
			dentroDePagina = true;
		} else {
			System.out.println("Url inválido!");
			dentroDePagina = false;
		}
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		dentroDePagina = false;
	}

	public void atualizarPagina() {
		if (dentroDePagina){
			System.out.println("Atualizando a pagina: "+url);
		} else System.out.println("É necessario entrar em uma pagina primeiro!");
	}


	// Reprodutor Musical
	public void tocar() {
		if (musicaSelecionada != null && !musicaSelecionada.isEmpty()) {
			System.out.println("Tocando a musica: " + musicaSelecionada);
			tocandoMusica = true;
		} else {
			System.out.println("Não foi possivel tocar a música, pois nenhuma foi selecionada anteriormente");
			tocandoMusica = false;
		}
	}

	public void pausar() {
		if (tocandoMusica) {
			System.out.println("Musica: " + musicaSelecionada + " pausada!");
			tocandoMusica = false;
		} else System.out.println("Nenhuma música está tocando!");
	}

	public void selecionarMusica(String musica) {
		if (musica != null && !musica.isEmpty()) {
			musicaSelecionada = musica;
			System.out.println("Musica: " + musicaSelecionada + " selecionada!");
		} else System.out.println("Não foi possivel selecionar a música");
	}

}