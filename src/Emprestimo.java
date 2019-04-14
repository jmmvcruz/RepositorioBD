import java.time.LocalDate;

public class Emprestimo {
    private java.time.LocalDate data;
    private Requisicao resquisicao;

    public LocalDate getData() {
        return data;
    }

    public Requisicao getResquisicao() {
        return resquisicao;
    }

    public Emprestimo(LocalDate data, Requisicao resquisicao) {
        this.data = data;
        this.resquisicao = resquisicao;


    }
}
