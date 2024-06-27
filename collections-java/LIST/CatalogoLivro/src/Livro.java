public class Livro {
	
	private String titulo;
	
	private String autor;
	
	private int ano;
	
	
	
	public Livro(String titulo, String autor, int ano) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAno(ano);
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		// TODO: Implement this method
		return "\ntitulo: " + this.getTitulo() + " | " + 
				"autor: "   + this.getAutor()  + " | " +
				"ano: "     + this.getAno();
		
	}
	
	
}
