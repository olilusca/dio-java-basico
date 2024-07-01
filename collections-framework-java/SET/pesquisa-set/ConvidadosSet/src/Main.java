import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	
		ContatoSet convidadoGerencia = new ContatoSet();
		
		convidadoGerencia.addContato("Lucas", "81776692");
		convidadoGerencia.addContato("Ochoa", "66665555");
		convidadoGerencia.addContato("Och", "66688855");
		convidadoGerencia.exibirContatos();
		//convidadoGerencia.addConvidado("Lucas", "81776692");
		//convidadoGerencia.removerConvidadoNome("L");
		System.out.println(convidadoGerencia.atulizaNumeroContato("Lucas", "123"));
		convidadoGerencia.exibirContatos();
	}
}
