import java.time.LocalDate;

public class Notificacao {
    private java.time.LocalDate data;
    private Emprestimo emprestimo;

    public LocalDate getData() {
        return data;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public Notificacao(LocalDate data, Emprestimo emprestimo) {
        this.data = data;
        this.emprestimo = emprestimo;


    }
}
