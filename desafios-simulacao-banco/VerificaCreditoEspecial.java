import java.util.Scanner;

public class VerificaCreditoEspecial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldo = sc.nextDouble();
        double saque = sc.nextDouble();
        double limiteCqEsp = 500;
        
        if(saque > (saldo + limiteCqEsp)) {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        } else if((saque > saldo) && saque <= (saldo + limiteCqEsp)){
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao realizada com sucesso.");
        }
        
        sc.close();
    }
}