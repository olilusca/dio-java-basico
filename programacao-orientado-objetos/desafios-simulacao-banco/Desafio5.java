import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double limiteDiario = sc.nextDouble();
        
        for(int x = 0; x < 1;) {
            int saque = sc.nextInt();
            
            if(saque == 0) {
                System.out.println("Transacoes encerradas.");
                x = 1;
            } else if(saque > limiteDiario) {
                System.out.println("Limite diario de saque excedido. Transacoes encerradas.");
                x = 1;
            } else {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }
        
    }
}