import java.util.*;

public class ContatoSet
{
	private Set<Contato> contatoSet;
	
	public ContatoSet() 
	{
		this.contatoSet = new HashSet<>();
	}
	
	public void addContato(String nom, String num)
	{
		this.contatoSet.add(new Contato(nom, num));
		System.out.println("Add!");
	}
	
	public void removerContatoPorNome(String nom)
	{
		Set<Contato> removeNome = new HashSet<>();
		if(this.contatoSet.isEmpty())
		{
			throw new RuntimeException("Empty set!");
		}
		
		for(Contato c : contatoSet) 
		{
			if(nom.equals(c.getNome()))
			{
				removeNome.add(c);
			} 
			else
			{
				throw new RuntimeException("Not exists!");
			}
		}
		contatoSet.remove(removeNome);
		System.out.println("Del!");
	}
	
	public void exibirContatos() 
	{
		if(contatoSet.isEmpty())
		{
			throw new RuntimeException("Empty set!");
		}
		
		System.out.println(this.contatoSet);
	}
	
	public Contato atulizaNumeroContato(String nom, String num)
	{
		Contato atualizado = null;
		if(!contatoSet.isEmpty())
		{
			for(Contato c : contatoSet)
			{
				if(c.getNome().equalsIgnoreCase(nom))
				{
					c.setNumero(num);
					atualizado = c;
					System.out.println("Upd!");
					break;
				}
			
			}
			
			return atualizado;
		}
		else
		{
			throw new RuntimeException("Empty set!");
		}
	}
}
