import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		PalavraSet palavraset = new PalavraSet();
		
		palavraset.addPalavra("Lucas");
		palavraset.addPalavra("Maria");
		System.out.println("Total in set: " + palavraset.exibirContagemPalavra());
		palavraset.removerPalavra("Luca");
		System.out.println("Exists? " + palavraset.verificarPalavra("Maria"));
	
	}
}
