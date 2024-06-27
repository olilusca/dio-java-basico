public class GerenciadorTarefas{
	
	public static void main(String[] args) {
		ListaTarefa tarefa1 = new ListaTarefa();
		
		tarefa1.adicionarTarefa("Comprar leite");
		tarefa1.adicionarTarefa("estudar");
		tarefa1.adicionarTarefa("Trabalhar");
		
		System.out.println("Numero de tarefas: " + tarefa1.obterNumeroTotalTarefas());
		tarefa1.obterDescricoesTarefa();
		
		tarefa1.removerTarefa("estudar");
		System.out.println("Numero de tarefas: " + tarefa1.obterNumeroTotalTarefas());
		tarefa1.obterDescricoesTarefa();
		
		tarefa1.removerTarefa("Comprar leite");
		System.out.println("Numero de tarefas: " + tarefa1.obterNumeroTotalTarefas());
		tarefa1.obterDescricoesTarefa();
		
		tarefa1.removerTarefa("trabalhar");
		System.out.println("Numero de tarefas: " + tarefa1.obterNumeroTotalTarefas());
		tarefa1.obterDescricoesTarefa();
		
		
	}
}
