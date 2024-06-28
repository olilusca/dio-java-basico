public class Pessoa
{
	private String nome;
	
	public Pessoa(String p) 
	{
		this.setNome(p);
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return "\nNome: " + this.getNome() + "\n";
	
	}
	
	
	
}
