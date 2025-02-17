import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        Scanner terminalScanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = terminalScanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = terminalScanner.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            terminalScanner.close();
        }
    }

    public static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = numeroDois - numeroUm;
            for(int inicializador = 0; inicializador < contagem; inicializador++) {
                System.out.println("Imprimindo o número " + numeroUm + ", Imprimindo o número " + numeroDois);
            }
        }
    }
}
