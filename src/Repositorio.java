import java.util.ArrayList;


public interface Repositorio {
     void adicionaPropostaRequisicao(PropostaAquisicao proposta);
    void adicionaCoima(Coima coima);
    void adicionaCopia(Copia copia);
    void adicionaDevolucao(Devolucao devolucao);
     void adicionaEmprestimo(Emprestimo emprestimo);
    void adicionaLivro(Livro livro);
    void adicionaNotificacao(Notificacao notificacao);
     void adicionaRequisicao(Requisicao requisicao);
     void adicionaEncomenda(Encomenda encomenda);
    void adicionaTipoUtilizador(TipoUtilizador tipo);
     void adicionaEntradaNovoLivro(EntradaNovoLivro entrada);
     void adicionaRequisicaoCompra (RequisicaoCompra compas);

}
