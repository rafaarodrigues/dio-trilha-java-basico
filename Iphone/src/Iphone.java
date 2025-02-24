public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void tocar() {
        System.out.println("Iphone: tocando a música.....");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone: pausando a música.....");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Iphone: selecionando a música.....");
    }

    @Override
    public void ligar() {
        System.out.println("Iphone: fazendo a ligação....");
    }

    @Override
    public void atender() {
        System.out.println("Iphone: atendendo a ligação....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone: iniciando correio de voz....");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Iphone: exibindo uma página....");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone: adicionando uma nova aba....");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone: atualizando uma página....");
    }

}
