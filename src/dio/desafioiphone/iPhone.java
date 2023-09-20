package dio.desafioiphone;

// Classe iPhone que implementa as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private String numeroTelefone;
    private boolean reproduzindoMusica;
    private boolean conectadoInternet;

    public iPhone(String modelo, String numeroTelefone) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
        this.reproduzindoMusica = false;
        this.conectadoInternet = false;
    }

    // Implementação dos métodos das interfaces
    @Override
    public void play() {
        // Implementação da reprodução de música
    }

    @Override
    public void pause() {
        // Implementação da pausa da música
    }

    @Override
    public void stop() {
        // Implementação do término da reprodução de música
    }

    @Override
    public void fazerChamada(String numero) {
        // Implementação da chamada telefônica
    }

    @Override
    public void atenderChamada() {
        // Implementação para atender chamada
    }

    @Override
    public void encerrarChamada() {
        // Implementação para encerrar chamada
    }

    @Override
    public void navegar(String url) {
        // Implementação da navegação na internet
    }

    @Override
    public void abrirAplicativo(String aplicativo) {
        // Implementação para abrir aplicativo
    }


}
