import java.util.*;

public class OrdenacaoPessoas {
	
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String n, int i, double a) {
		pessoaList.add(new Pessoa(n, i, a));
	}
	
	public void removerPessoa(String nome) {
		List<Pessoa> pessoaParaRemover = new ArrayList<>();
		if(!pessoaList.isEmpty()) {
			for(Pessoa p : pessoaList) {
				if(p.getNome().equalsIgnoreCase(nome)) {
					pessoaParaRemover.add(p);
				}
			}
			pessoaList.removeAll(pessoaParaRemover);
		} else {
			throw new RuntimeException("Lista vazia!");
		}
	}
	
	public int totalPessoas() {
		return pessoaList.size();
	}
	
	public List<Pessoa> ordenarPorIdade() 
	{
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		if(!pessoaList.isEmpty()) 
		{
			Collections.sort(pessoasPorIdade);
			return pessoasPorIdade;
		} 
		else 
		{
			throw new RuntimeException("Lista vazia!");
		}
	}
	
	public List<Pessoa> ordenarPorAltura() 
	{
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		if(!pessoaList.isEmpty()) {
			Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
			return pessoasPorAltura;
		} else {
			throw new RuntimeException("Lista vazia!");
		}
	}
	
	

}
