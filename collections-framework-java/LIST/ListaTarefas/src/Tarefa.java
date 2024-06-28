public class Tarefa {
	
	private String descricao;
	
	//Construtor que obriga a passagem de uma descrição para a...
	//criação de um objeto do tipo Tarefa
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	//Obtem informações da descrição da Tarefa
	public String getDescricao() {
		return this.descricao;
	}
	
	//Exibe a descricao na saída
	public String toString() {
		return descricao;
	}
}
