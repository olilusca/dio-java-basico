import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionarItem("Carne", 20.0, 1);
		c1.adicionarItem("Leite",5.50, 1);
		c1.adicionarItem("Uva", 5.00,4);
		
		System.out.println("Número total de itens no carrinho: " + c1.numeroTotalItens());
		c1.exibirItens();
		
		System.out.println("Valor total adicionado no carrinho: " + (c1.calculaValorItens()));
	}
}
