public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	
	private int idade;
	
	private double altura;

	public Pessoa(String nome, int idade, double altura) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setAltura(altura);
	}

	@Override
	public int compareTo(Pessoa p1) {
		return Integer.compare(idade, p1.getIdade());
	}

	
	
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString(){
		// TODO: Implement this method
		String idade  = Integer.toString(this.getIdade());
		String altura = Double.toString(this.getAltura());
		
		return "\nPessoa = " +
			   "\nnome: "   + this.getNome()  + " | " +
			   "idade: "  + idade  + " | " +
			   "altura: " + altura + "\n";
	}
}
