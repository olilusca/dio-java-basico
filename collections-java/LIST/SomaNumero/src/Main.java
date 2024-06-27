import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		SomaNumeros soma = new SomaNumeros();
		
		soma.adicionaNumeros(1);
		soma.adicionaNumeros(500);
		soma.adicionaNumeros(300);
		
		System.out.println("Soma de todos os números na lista: " + soma.calculaSoma());
		System.out.println("Números na lista: " + soma.exibirNumeros());
		System.out.println("Maior número da lista: " + soma.encontrarMaiorNumero());
	}
}
