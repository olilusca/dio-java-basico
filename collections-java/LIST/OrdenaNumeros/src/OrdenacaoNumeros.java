import java.util.*;
import org.apache.http.conn.util.*;

public class OrdenacaoNumeros
{
	
	private List<Numero> numeroList;
	
	public OrdenacaoNumeros()
	{
		this.numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int n) 
	{
		numeroList.add(new Numero(n));
	}
	
	public List<Numero> ordenarAscendente()
	{
		List<Numero> numeroAscendente = new ArrayList<>(numeroList);
		if(!numeroList.isEmpty())
		{
			Collections.sort(numeroAscendente);
			return numeroAscendente;
		} 
		else
		{
			throw new RuntimeException("Lista vazia!");
		}
	}
	
	public List<Numero> ordenarDescendente()
	{
		List<Numero> numeroDescendente = new ArrayList<>(numeroList);
		if(!numeroList.isEmpty())
		{
			Collections.reverse(numeroDescendente);
			return numeroDescendente;
		}
		else
		{
			throw new  RuntimeException("Lista vazia!");
		}
	}
	
	public List<Numero> comparatorReverse()
	{
		List<Numero> comparatorInverso = new ArrayList<>(numeroList);
		if(!numeroList.isEmpty())
		{
			Collections.sort(comparatorInverso, new OrdenaNumeroComparator());
			return comparatorInverso;
		}
		else
		{
			throw new RuntimeException("Lista vazia!");
		}
	}
	
	
}
