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
        } catch (ParametrosInvalidosException exception) {
            // TODO: handle exception
        }
        
        
        // se o PRIMEIRO NUMERO > SEGUNDO NUMERO lançar uma EXCEÇÃO CUSTOMIZADA com a mensagem "O segundo parâmetro deve ser maior que o primeiro"
    }

    public static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm > numeroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = numeroDois - numeroUm;
            for(int inicializador = 0; inicializador < contagem; inicializador++) {
                System.out.println("Imprimindo o número " + numeroUm + ", Imprimindo o número " + numeroDois);
            }
        }
    }
}
