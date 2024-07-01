import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		ConjuntoConvidado cj = new ConjuntoConvidado();
		
		cj.addConvidado(1111, "Lucas");
		cj.addConvidado(1112, "Lucio");
		cj.addConvidado(1113, "Luas");
		cj.addConvidado(1111, "Luca");
		
		cj.exibirConvidados();
	}
	
}
