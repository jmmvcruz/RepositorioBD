import java.time.LocalDate;

public class RequisicaoCompraCopia {
    private java.time.LocalDate data;
    private String estado;
    private String oficio;
    private Livro livro;
    private Utilizador utilizador;

    public RequisicaoCompraCopia(String estado,LocalDate data, String oficio, Livro livro, Utilizador utilizador) {
        this.estado = estado;
        this.data = data;

        this.oficio = oficio;
        this.livro = livro;
        this.utilizador = utilizador;
    }

    public LocalDate getData() {
        return data;
    }

    public String getEstado() {
        return estado;
    }

    public String getOficio() {
        return oficio;
    }

    public Livro getLivro() {
        return livro;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
}

