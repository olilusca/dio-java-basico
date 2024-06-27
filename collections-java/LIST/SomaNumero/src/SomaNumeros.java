import java.util.*;

public class SomaNumeros {
	
	private List<Numero> listaNumeros;
	
	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionaNumeros(int numeros) {
		listaNumeros.add(new Numero(numeros));
	}
	
	public int calculaSoma() {
		int totalSoma = 0;
		if(!listaNumeros.isEmpty()) {
			for(Numero n : listaNumeros) {
				 totalSoma += n.getNumero();
			}
			return totalSoma;
		} else {
			throw new RuntimeException("Lista vazia!");
		}
		
	}
	
	public List<Numero> exibirNumeros() {
		List<Numero> todosNumeros = new ArrayList<>();
		if(!listaNumeros.isEmpty()) {
			for(Numero n : listaNumeros) {
				todosNumeros.add(n);
			}
			return todosNumeros;
		} else {
			throw new RuntimeException("Lista vazia!");
		}
		
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = 0;
		if(!listaNumeros.isEmpty()) {
			for(Numero n : listaNumeros) {
				if(n.getNumero() > maiorNumero) {
					
					maiorNumero = n.getNumero();
				}
			}
			return maiorNumero;
		} else {
			throw new RuntimeException("Lista vazia!");
		}
	}

	@Override
	public String toString() {
		return "Valor = " + this.listaNumeros;
	}
	
	
}
