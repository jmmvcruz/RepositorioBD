public class Utilizador {
    private String nome;
    private String estado;
    private TipoUtilizador tipo;



    public Utilizador(String nome, String estado, TipoUtilizador uti) {
        this.nome = nome;
        this.estado = estado;
        this.tipo= uti;

    }


    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public TipoUtilizador getTipo() {
        return tipo;
    }
}
