import java.util.*;

public class CarrinhoDeCompras {
	
	private List<Item> itens;

	
	// Ao criar um objeto do tipo CarrinhoDeCompras na classe principal, o atributo de..
	// tipo List<Item> (linha 5) é instanciado pelo construtor:
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>(); // << O atributo "itens" (linha 5) é uma nova lista.
	}
	
	// Método que permite passar os atributos da classe "Item", delegado pelo construtor do mesmo (classe "Item", linha 10).
	// O construtor da classe "Item" (Item.java, linha 10) é passada dentro do metodo ".add()"
	public void adicionarItem(String n, double p, int q) {
		itens.add(new Item(n, p, q)); // << .".add()" método de lista que adiciona objetos do tipo da lista.
	}
	
	// Método que remove um item com base no nome:
	public void removerItem(String nome) {
		
		// Uma nova lista do tipo "Item' é criada para receber objetos para remover:
		List<Item> itensParaRemover = new ArrayList<>();
		
		// Verifica se o atributo itens (linha 5) não está vazio:
		if(!itens.isEmpty()) {
			
			// Laço que adiciona a "i" cada objeto do atributo itens (linha 5)
			for(Item i : itens) {
				
				// Se no objeto "i" constar o nome passado no método removerItem (linha 21),...
				// o objeto que contém a informação será adicionado na lista para remoção (linha 24) por...
				// meio do método de listas ".add()", através da lista de remoção (linha 24):
				if(i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i); // << Objetos contidos em "i" adicionados na lista de remoção (linha 24)
				}
				
				// Após os objetos estarem dentro da lista de remoção (linha 24), eles...
				// serão removidos utilizando o método de listas ".removeAll()"
				itens.removeAll(itensParaRemover);
			}
		} else { // << caso  lista esteja vazia:
			System.out.println("Lista vazia!");
			
		}
	}
	
	// ".size()" é um método de lista que retorna a quantidade de objetos...
	// presentes na lista
	public int numeroTotalItens() {
		return itens.size(); 
	}
	
	public double calculaValorItens() {
		double valorTotal = 0;
		if(!itens.isEmpty()) {
			
			// Laço que irá passar por cada objeto do atributo (linha 5)...
			// e adicionar os objetos do tipo "Item" a "i":
			for(Item i : itens) {
				
				// Com os objetos do tipo "Item" adicionados, será adicionado...
				// a variável "valorItem", os valores do atributo "preco" e "quantidade", presentes...
				// na classe "Item" (Item.java, linha 5 e Linha 7) e multiplicados entre si:
				double valorItem = i.getPreco() * i.getQuantidade();
				
				// O valor da multiplicação será adicionado a variável inicial...
				// declarado e inicializado na linha 56:
				valorTotal += valorItem;
			}
			
			// O valorTotal será retornado;
			return valorTotal;
		} else {
			// Caso a lista (linha 5 estiver vazia, será lançada uma exceção em tempo de execução:
			throw new RuntimeException("Lista vazia!");
		}
	}
	
	public void exibirItens() {
		if(!itens.isEmpty()) {
			System.out.println(this.itens);
		} else {
			System.out.println("Lista vazia!");
		}
	}

	@Override
	public String toString() {
		// TODO: Implement this method
		return "CarrinhoDeCompras {" +
			   "itens = " + itens +
			   "}";
	}
	
}
