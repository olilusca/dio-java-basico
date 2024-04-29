import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Criação de conta");
        
        System.out.println("Insira o nome da conta: ");
        String nomeConta = input.next();
        System.out.println("");
        
        System.out.println("Insira o número da conta: ");
        int numeroConta = input.nextInt();
        System.out.println("");
        
        System.out.println("Conta criada com sucesso!");
        System.out.println("");
        
        System.out.println("Informações da conta:");
        System.out.println("Nome: " + nomeConta);
        System.out.println("Número: " + numeroConta);
    }
}