
import java.util.*;

public class DesafioControleFluxo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Parâmetro Um: ");
		int parametroUm = scanner.nextInt();
		System.out.println("Parâmetro Dois: ");
		int parametroDois = scanner.nextInt();
		
		try {
		Contador cont = new Contador();
		cont.contar(parametroUm, parametroDois);
		} catch(ParametrosInvalidosException | InputMismatchException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Try/Catch encerrado!");
		}
	}
}
