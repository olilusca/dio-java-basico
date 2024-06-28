import java.util.Scanner;

public class CriarConta {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idade = sc.nextInt();
        
        if(idade <= 17) {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
            return;
        }
        
        System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        sc.close();

    }
}