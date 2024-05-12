public class Iphone {
    public static void main(String[] args) {
        // Criando uma instância da classe Aparelho
        Aparelho aparelho = new Aparelho();

        // Chamando os métodos da interface ReprodutorMusical
        aparelho.selecionarMusica();
        aparelho.tocar();
        aparelho.pausar();

        // Chamando os métodos da interface Navegador
        aparelho.exibirPagina();
        aparelho.adicionarNovaPagina();
        aparelho.atualizarPagina();

        // Chamando os métodos da interface AparelhoTelefonico
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioDeVoz();
    }
}
