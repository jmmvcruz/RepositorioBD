import java.time.LocalDate;


public class Encomenda {
    private java.time.LocalDate data;
    private RequisicaoCompra resquisicao;


    public LocalDate getData() {
        return data;
    }

    public RequisicaoCompra getResquisicao() {
        return resquisicao;
    }

    public Encomenda(LocalDate data, RequisicaoCompra resquisicao) {
        this.data = data;
        this.resquisicao = resquisicao;
    }
}
