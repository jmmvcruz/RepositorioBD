public class TipoUtilizador {
    private String descriçao;
    private int prazoEmprestimo;




    public TipoUtilizador(String descriçao, int prazoEmprestimo) {
        this.descriçao = descriçao;
        this.prazoEmprestimo = prazoEmprestimo;


    }

    public String getDescriçao() {
        return descriçao;
    }

    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }
}
