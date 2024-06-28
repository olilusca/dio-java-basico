

public class Palavra
{
	private String palavra;

	public Palavra(String palavra)
	{
		this.setPalavra(palavra);
	}

	@Override
	public boolean equals(Object obj)
	{
		// TODO: Implement this method
		if(this == obj) return true;
		if(!(obj instanceof Palavra palavra)) return false;
		return this.getPalavra() == palavra.getPalavra();
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return "\nNome: " + this.getPalavra() + "\n";
	}

	

	public void setPalavra(String palavra)
	{
		this.palavra = palavra;
	}

	public String getPalavra()
	{
		return palavra;
	}
	
}
