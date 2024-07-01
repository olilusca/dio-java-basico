import java.util.*;

public class PalavraSetObjeto
{
	private Set<Palavra> palavraSet;
	
	public PalavraSetObjeto()
	{
		this.palavraSet = new HashSet<>();
	}
	
	public void addPalavra(String palavra)
	{
		palavraSet.add(new Palavra(palavra));
	}
	
	public void removerPalavra(String palavra)
	{
		Palavra palavraRemove = null;
		if(!palavraSet.isEmpty())
		{
			for(Palavra p : palavraSet)
			{
				if(palavra.equalsIgnoreCase(p.getPalavra())){
					palavraRemove = p;
				}
				else
				{
					System.out.println("Palavra inexistente no conjunto!");
					return;
				}
			}
			palavraSet.remove(palavraRemove);
			System.out.println("Palavra removida!");
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
