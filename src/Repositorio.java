import java.util.ArrayList;

public class Repositorio {

    ArrayList<Coima> coimas = new ArrayList<Coima>();
    ArrayList<Copia> copias = new ArrayList<Copia>();
    ArrayList<Devolucao> devolucoes = new ArrayList<Devolucao>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Notificacao> notificacoes = new ArrayList<Notificacao>();
    ArrayList<Requisicao> requisicoes = new ArrayList<Requisicao>();
    ArrayList<TipoUtilizador> tipoutilizadores = new ArrayList<TipoUtilizador>();
    ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();

    void 	adicionaCoima(Coima coima){
        coimas.add(coima);
    }

    void adicionaCopia(Copia copia){
        copias.add(copia);
    }

    void adicionaDevolucao(Devolucao devolucao){
        devolucoes.add(devolucao);

    }

    void adicionaEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    void 	adicionaLivro(Livro livro) {
        livros.add(livro);

    }
    void 	adicionaNotificacao(Notificacao notificacao){
        notificacoes.add(notificacao);

    }

    void adicionaRequisicao(Requisicao requisicao){
        requisicoes.add(requisicao);
    }
    void adicionaTipoUtilizador(TipoUtilizador tipo){
        tipoutilizadores.add(tipo);
    }

    void	adicionaUtilizador(Utilizador utilizador){
        utilizadores.add(utilizador);
    }

    Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
        for (Emprestimo emp : emprestimos) {
            if (r == emp.getResquisicao())
                return emp;

        }
        return null;
    }
}
