import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();

        int opcao;
        boolean continua = true;

        do {
            exibirMenu();
            System.out.print("Opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> iphone.tocar();
                case 2 -> iphone.pausar();
                case 3 -> iphone.selecionarMusica();
                case 4 -> iphone.ligar();
                case 5 -> iphone.atender();
                case 6 -> iphone.iniciarCorreioVoz();
                case 7 -> iphone.exibirPagina();
                case 8 -> iphone.adicionarNovaAba();
                case 9 -> iphone.atualizarPagina();
                case 0 -> continua = false;
                default -> System.out.println("opção inválida");
            }
        }while(continua);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n----------Selecione uma opção no aparelho----------");
        System.out.println("1 - Tocar música");
        System.out.println("2 - Pausar música");
        System.out.println("3 - Selecionar música");
        System.out.println("4 - Ligar");
        System.out.println("5 - Atender");
        System.out.println("6 - Iniciar correio de voz");
        System.out.println("7 - Exibir página");
        System.out.println("8 - Adicionar nova aba");
        System.out.println("9 - Atualizar página");
        System.out.println("0 - Sair");
    }
}

