public class Numero {
	
	private int numero;
	
	public Numero(int numero) {
		this.setNumero(numero);
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		String valor = Integer.toString(this.getNumero());
		return valor;
	}
	
	
	
	
}
