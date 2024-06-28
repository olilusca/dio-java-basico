import java.util.*;

public class Main {
	public static void main(String[] args) {
		CatalogoLivros c1 = new CatalogoLivros();
		
		c1.adicionarLivro("Colher", "Jojout", 2014);
		c1.adicionarLivro("Ceruja", "Inferi", 2016);
		System.out.println("Total de livros registrados: " + c1.totalLivros());
		
		
		System.out.println(c1.pesquisarPorIntervaloAno(2010, 2016));
		//System.out.println(c1.pesquisarPorAutor("Jojout"));
		//System.out.println(c1.pesquisarPorTitulo("Ceruja"));
	}
}
