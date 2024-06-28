import java.util.*;

public class PalavraSet
{
	private Set<String> palavraSet;

	public PalavraSet()
	{
		this.palavraSet = new HashSet<>();
	}

	public void addPalavra(String palavra)
	{
		palavraSet.add(palavra);
		System.out.println("Add!");
	}

	public void removerPalavra(String palavra)
	{
		if(!palavraSet.isEmpty())
		{
			if(palavraSet.contains(palavra)) {
				palavraSet.remove(palavra);
				System.out.println("Del!");
			}
			else
			{
				System.out.println("Void!");
			}
		}
		else
		{
			throw new RuntimeException("Lista vazia!");
		}

	}

	public int exibirContagemPalavra()
	{
		return palavraSet.size();
	}
	
	public boolean verificarPalavra(String palavra)
	{
		return palavraSet.contains(palavra);
	}
	
	public void exibirPalavras()
	{
		if(!palavraSet.isEmpty())
		{
			System.out.println(palavraSet);
		} 
		else
		{
			throw new RuntimeException("Lista vazia!");
		}
	}
}
