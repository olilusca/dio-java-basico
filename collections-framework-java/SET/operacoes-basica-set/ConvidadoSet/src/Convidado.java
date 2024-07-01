import java.util.Objects;

public class Convidado
{
	private int codigoConvite;
	
	private String nome;
	
	public Convidado(int c, String n) 
	{
		this.setCodigoConvite(c);
		this.setNome(n);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Convidado convidado)) return false;
		return getCodigoConvite() == convidado.getCodigoConvite();
	}

	@Override
	public int hashCode()
	{
		// TODO: Implement this method
		return Objects.hash(getCodigoConvite());
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return "\nCodigo: " + this.getCodigoConvite() + " | " +
			   "Nome: " + this.getNome() + "\n";
		
	}
	
	public void setCodigoConvite(int codigoConvite)
	{
		this.codigoConvite = codigoConvite;
	}

	public int getCodigoConvite()
	{
		return codigoConvite;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}
	
}
