public class Coima {
    private String decricao;
    private float valor;
    private Devolucao devolucao;

    public String getDecricao() {
        return decricao;
    }

    public float getValor() {
        return valor;
    }

    public Devolucao getDevolucao() {
        return devolucao;
    }

    public Coima(String decricao, float valor, Devolucao devolucao) {
        this.decricao = decricao;
        this.valor = valor;
        this.devolucao = devolucao;


    }
}