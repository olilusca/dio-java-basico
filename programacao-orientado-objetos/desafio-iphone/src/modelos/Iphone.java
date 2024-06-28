package modelos;
import aparelhos.*;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void tocar() {
		System.out.println("iPhone: tocando musica...");
	}

	@Override
	public void pausar() {
		System.out.println("iPhone: pausando musica...");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("iPhone: selecionando musica...");
	}

	@Override
	public void ligar() {
		System.out.println("iPhone: iniciando ligacao...");

	}

	@Override
	public void atender() {
		System.out.println("iPhone: atendendo ligacao...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iPhone: ligando para correio de voz...");
	}

	@Override
	public void exibirPagina() {
		System.out.println("iPhone: exibindo pagina web...");
	}

	@Override
	public void adicionarAba() {
		System.out.println("iPhone: adicionando nova aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("iPhone: atualizando pagina web...");
	}



}
