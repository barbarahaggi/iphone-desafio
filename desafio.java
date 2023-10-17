+-----------------------------------------+
|                 iPhone                |
|-----------------------------------------|
| - reprodutor: ReprodutorMusical       |
| - telefone: AparelhoTelefonico        |
| - navegador: NavegadorInternet        |
+-----------------------------------------+
| + ligar()                             |
| + atender()                           |
| + iniciarChamadaVoz()                 |
| + exibirPagina()                       |
| + adicionarNovaAba()                  |
| + atualizarPagina()                   |
+-----------------------------------------+


public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}


public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarChamadaVoz();
}


public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}


public class iPhone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public iPhone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    public void atender() {
        telefone.atender();
    }

    public void iniciarChamadaVoz() {
        telefone.iniciarChamadaVoz();
    }

    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    public void adicionarNovaAba(String url) {
        navegador.adicionarNovaAba(url);
    }

    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    public void tocar() {
        reprodutor.tocar();
    }

    public void pausar() {
        reprodutor.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }
}
