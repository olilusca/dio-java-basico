public class Main {
	
	public static void main(String[] args) {
		
		OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
		
		ordenacaoPessoa.adicionarPessoa("Lucas", 27, 1.88);
		ordenacaoPessoa.adicionarPessoa("Rozario", 100, 1.70);
		
		System.out.println((ordenacaoPessoa.ordenarPorIdade()));
		System.out.println((ordenacaoPessoa.ordenarPorAltura()));
		
		System.out.println("Total pessoas: " + (ordenacaoPessoa.totalPessoas()));
		ordenacaoPessoa.removerPessoa("Lucas");
		System.out.println("Total pessoas: " + (ordenacaoPessoa.totalPessoas()));
	}
}
