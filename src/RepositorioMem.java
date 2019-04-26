
import java.util.ArrayList;
import java.util.Iterator;

public class RepositorioMem implements Repositorio{

    ArrayList<Utilizador> ListaUtilizadores = new ArrayList();
    ArrayList<TipoUtilizador> ListaTipoUtilizadores = new ArrayList();
    ArrayList<Requisicao> ListaRequisicao = new ArrayList();
    ArrayList<Copia> ListaCopia = new ArrayList();
    ArrayList<Livro> ListaLivro = new ArrayList();
    ArrayList<Emprestimo> Lista_emprestimos = new ArrayList();
    ArrayList<Notificacao> ListaNotificacao = new ArrayList();
    ArrayList<Devolucao> ListaDevolucao = new ArrayList();
    ArrayList<Coima> ListaCoima = new ArrayList();
    ArrayList<Encomenda> Lista_encomendas = new ArrayList();
    ArrayList<PropostaAquisicao> Lista_propostaAquisicao = new ArrayList();
    ArrayList<RequisicaoCompra> Lista_requisicaoCompra = new ArrayList();
    ArrayList<EntradaNovoLivro> Lista_entradaNovoLivro = new ArrayList();


    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
        this.Lista_requisicaoCompra.add(requisicaoCompra);
    }

    public void adicionaEncomenda(Encomenda encomenda) {
        this.Lista_encomendas.add(encomenda);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta) {
        this.Lista_propostaAquisicao.add(proposta);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        this.Lista_entradaNovoLivro.add(entradaNovoLivro);
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        this.ListaUtilizadores.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        this.ListaTipoUtilizadores.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao) {
        this.ListaRequisicao.add(requisicao);
    }

    public void adicionaCopia(Copia copia) {
        this.ListaCopia.add(copia);
    }

    public void adicionaLivro(Livro livro) {
        this.ListaLivro.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        this.Lista_emprestimos.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        this.ListaNotificacao.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        this.ListaDevolucao.add(devolucao);
    }

    public void adicionaCoima(Coima coima) {
        this.ListaCoima.add(coima);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
        Iterator var2 = this.Lista_emprestimos.iterator();

        Emprestimo e;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            e = (Emprestimo)var2.next();
        } while(e.getResquisicao() != r);

        return e;
    }

}
