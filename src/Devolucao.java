import java.time.LocalDate;

public class Devolucao {
    java.time.LocalDate data;
    Emprestimo emprestimo;

    public LocalDate getData() {
        return data;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public Devolucao(LocalDate data, Emprestimo emprestimo) {
        this.data = data;
        this.emprestimo = emprestimo;



    }
}
