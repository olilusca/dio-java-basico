import java.util.*;

public class Contato
{
	private String nome;
	
	private String numero;
	
	public  Contato(String nome, String numero)
	{
		this.setNome(nome);
		this.setNumero(numero);
	}

	@Override
	public boolean equals(Object obj)
	{
		// TODO: Implement this method
		if(this == obj) return true;
		if(!(obj instanceof Contato convidado)) return false;
		return this.getNome() == convidado.getNome();
	}

	@Override
	public int hashCode()
	{
		// TODO: Implement this method
		return Objects.hash(getNome());
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return "\nNome: " + this.getNome() + " | " +
			   "Numero: " + this.getNumero() + "\n";
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}

	public String getNumero()
	{
		return numero;
	}
	
}
