import aparelhos.*;
import modelos.*;


public class Usuario {
	public static void main(String[] args) {
		
		ReprodutorMusical rp = new Iphone();
		
		rp.selecionarMusica();
		rp.tocar();
		rp.pausar();
		
		AparelhoTelefonico at = new Iphone();
		
		at.ligar();
		at.atender();
		at.iniciarCorreioVoz();
		
		NavegadorInternet ni = new Iphone();
		
		ni.adicionarAba();
		ni.exibirPagina();
		ni.atualizarPagina();
	}
}
