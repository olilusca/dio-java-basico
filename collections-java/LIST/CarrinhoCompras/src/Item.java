public class Item {

	private String nome;

	private double preco;

	private int quantidade;


	public Item(String nome, double preco, int qtde) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(qtde);
	}

	@Override
	public String toString() {
		return "Item { " + 
			"nome: " + this.getNome() + " / " +
			"preço: " + this.getPreco() + " / " +
			"quantidade: " + this.getQuantidade() +
			"}\n";
	}

	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	public void setPreco(double preco)
	{
		this.preco = preco;
	}

	public double getPreco()
	{
		return preco;
	}

	public void setQuantidade(int quantidade)
	{
		this.quantidade = quantidade;
	}

	public int getQuantidade()
	{
		return quantidade;
	}

}
