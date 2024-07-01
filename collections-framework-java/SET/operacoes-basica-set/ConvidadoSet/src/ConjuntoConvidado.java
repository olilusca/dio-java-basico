
import java.util.*;
public class ConjuntoConvidado
{
	
	Set<Convidado> convidadoSet;
	
	public ConjuntoConvidado()
	{
		this.convidadoSet = new HashSet<>();
	}
	
	public void addConvidado(int codigo, String nome)
	{
		convidadoSet.add(new Convidado(codigo, nome));
	}
	
	public void removerPorCodigo(int codigo)
	{
		Convidado convidadoRemover = null;
		if(!convidadoSet.isEmpty())
		{
			for(Convidado c : convidadoSet)
			{
				if(c.getCodigoConvite() == codigo)
				{
					convidadoRemover = c;
					break;
				}
			}
			convidadoSet.remove(convidadoRemover);
		} 
		else
		{
			throw new RuntimeException("Lista vazia!");
		}
	}
	
	public int contarConvidados()
	{
		return convidadoSet.size();
	}
	
	public void exibirConvidados()
	{
		if(!convidadoSet.isEmpty())
		{
			System.out.println(convidadoSet);
		}
		else
		{
			throw new RuntimeException("Lista vazia!");
		}
	}
}
