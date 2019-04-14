import java.time.LocalDate;

public class RequisicaoCompraLivro {
    private java.time.LocalDate data;
    private String estado;
    private String oficio;
    private Livro livro;
    private Utilizador utilizador;

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

    public RequisicaoCompraLivro(LocalDate data, String estado, String oficio, Livro livro, Utilizador utilizador) {
        this.data = data;
        this.estado = estado;
        this.oficio = oficio;
        this.livro = livro;
        this.utilizador = utilizador;


    }
}
