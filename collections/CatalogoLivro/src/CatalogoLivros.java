import java.util.*;

public class CatalogoLivros {
	
	private List<Livro> listaLivro;
	
	public CatalogoLivros() {
		this.listaLivro = new ArrayList<>();
	}
	
	public void adicionarLivro(String nome, String autor, int ano) {
		listaLivro.add(new Livro(nome, autor, ano));
	}
	
	public int totalLivros() {
		return listaLivro.size();
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!listaLivro.isEmpty()) {
			for(Livro l : listaLivro) {
				if(l.getAutor().equalsIgnoreCase((autor))) {
					livrosPorAutor.add(l);
				} // fim if
			} // fim for
			return livrosPorAutor;
		} else {
			throw new RuntimeException("Lista vazia!");
		} // fim if/else
		
	}
	
	public List<Livro> pesquisarPorTitulo(String titulo) {
		List<Livro> livrosPorTitulo = new ArrayList<>();
		if(!listaLivro.isEmpty()) {
			for(Livro l : listaLivro) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livrosPorTitulo.add(l);
				}
			}
			
			return livrosPorTitulo;
		} else {
			throw new RuntimeException("Lista vazia!");
		}
	}
	
	public List<Livro> pesquisarPorIntervaloAno(int ai, int af) {
		List<Livro> livrosPorInterAno = new ArrayList<>();
		if(!listaLivro.isEmpty()) {
			for(Livro l : listaLivro) {
				if(l.getAno() >= ai && l.getAno() <= af) {
					livrosPorInterAno.add(l);
				}
			}
			return livrosPorInterAno;
			
		} else {
			throw new RuntimeException("Lista vazia!");
		}
	}

	@Override
	public String toString() {
		// TODO: Implement this method
		return "Livro = " + this.listaLivro;
	}
	
	
}
