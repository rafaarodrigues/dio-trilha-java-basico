import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt(); 

        System.out.println("Por favor, digite o nome da Agência!");
        String agencia = scanner.next();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome completo!");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já estpa disponível para saque");
    }
}
