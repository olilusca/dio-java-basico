
import java.util.*;

public class Numero implements Comparable<Numero>
{
	private int numero;
	
	public Numero(int numero)
	{
		this.setNumero(numero);
	}

	@Override
	public int compareTo(Numero p1)
	{
		// TODO: Implement this method
		return Integer.compare(this.getNumero(), p1.getNumero());
	}


	

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public int getNumero()
	{
		return numero;
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		String n = Integer.toString(this.getNumero());
		return "\nNúmero = " + n + "\n";
	}
	
	
}
