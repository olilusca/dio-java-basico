import java.util.Scanner;

public class Validador {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String numero = sc.next();
        
        try {
            verificaNumero(numero);
            System.out.println("Numero de conta valido.");
        } catch(IllegalArgumentException e) {
            System.out.print("Erro: " + e.getMessage());
        }
    }
    
    private static void verificaNumero(String numero) {
        if(numero.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}