import java.util.*;

public class OrdenaPessoaNome
{
	
	private List<Pessoa> pessoaList;
	
	public OrdenaPessoaNome() 
	{
		this.pessoaList = new ArrayList<>();
	}
	
	public void addPessoa(String n) 
	{
		pessoaList.add(new Pessoa(n));
	}
	
	public List<Pessoa> OrdenaPessoaNome() 
	{
		List<Pessoa> pessoaNome = new ArrayList<>(pessoaList);
		if(!pessoaList.isEmpty()) 
		{
			Collections.sort(pessoaNome, new ComparatorPessoa());
			return pessoaNome;
		} else 
		{
			throw new RuntimeException("Lista vazia!");
		}
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return "Pessoa = " + this.pessoaList;
	}
	
	
}
