import java.util.*;

public class ListaTarefa {
	
	//Atributo que recebe uma lista do tipo Tarefa
	private List<Tarefa> tarefaList;
	
	//Construtor que instancia uma nova lista de tarefas vazia ao criar um objeto do tipo ListaTarefa
	//Fica apta a receber objetos do tipo Tarefa, oriundas da classe Tarefa
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	//Método que adiciona um objeto to tipo Tarefa dentro do atributo tarefaList...
	//que recebe uma lista de objetos Tarefa
	
	//Ao declarar o metodo .add, será passado o construtor da classe Tarefa para...
	//criar um objeto do tipo Tarefa, e como definido na classe, a obrigatoriedade...
	//de passar uma descrição para a criação do objeto do tipo Tarefa
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	//Cria o metodo para remover um objeto da lista de tarefas, e obriga a passagem de uma descrição:
	public void removerTarefa(String descricao) {
		
		//Instancia uma nova lista de tarefas para receber as tarefas que serão removidas:
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
			
		//Tratamento de erros para caso da lista estar vazia, não executar os procedimentos de remoção:
		if (!tarefaList.isEmpty()) {
			
			//Laço que percorre e adiciona a "t" cada tarefa dentro de tarefaList:
			for(Tarefa t : tarefaList) {
				
				//Condição que adiciona as tarefas dentro de tarefasParaRemover, com base em uma descrição:
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
			 		tarefasParaRemover.add(t); // <== Adiciona em tarefasParaRemover tudo contido em "t"
				}
			}
			tarefaList.removeAll(tarefasParaRemover); // <== ".removeAll" Método que remove objetos da lista
		} else {
			System.out.println("Lista está vazia!");
		}
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size(); // <== ".size" método que retorna a quantidade de objetos na lista
	}
	
	public void obterDescricoesTarefa() {
		if(!tarefaList.isEmpty()) {
			System.out.println(tarefaList);
		} else {
			System.out.println("Lista está vazia!");
		}
	}
}
