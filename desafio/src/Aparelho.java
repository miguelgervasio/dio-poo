public class Aparelho implements ReprodutorMusical, Navegador, AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Chamada encaminhada para o correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando nova música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }
    
}
