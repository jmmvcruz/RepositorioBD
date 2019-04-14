import java.time.LocalDate;

public class PropostaAquisicao {
    private java.time.LocalDate data;
    private Utilizador utilizador;
    private String infolivro;

    public PropostaAquisicao(LocalDate data, Utilizador utilizador, String infolivro) {
        this.data = data;
        this.utilizador = utilizador;
        this.infolivro = infolivro;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public String getInfolivro() {
        return infolivro;
    }
}
