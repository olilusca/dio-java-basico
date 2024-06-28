import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		OrdenaPessoaNome pessoaList = new OrdenaPessoaNome();
		
		pessoaList.addPessoa("Alberto");
		pessoaList.addPessoa("Francisco");
		pessoaList.addPessoa("Geraldo");
		pessoaList.addPessoa("Laura");
		
		System.out.println((pessoaList.OrdenaPessoaNome()));
	}
}
