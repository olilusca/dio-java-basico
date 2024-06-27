import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		OrdenacaoNumeros ordenaNumero = new OrdenacaoNumeros();
		
		ordenaNumero.adicionarNumero(1);
		ordenaNumero.adicionarNumero(5);
		ordenaNumero.adicionarNumero(7);
		ordenaNumero.adicionarNumero(10);
		
		System.out.println(ordenaNumero.ordenarAscendente());
		//System.out.println(ordenaNumero.ordenarDescendente());
		System.out.println(ordenaNumero.comparatorReverse());
	
	}
}
