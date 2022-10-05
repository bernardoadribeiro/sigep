package br.com.sigep.servicos.log;

import br.com.sigep.entidades.log.LogNivel;

public interface LogServico {
    public void registrar(LogNivel nivel, String acao, String descricao);
    public void registrar(LogNivel nivel, String descricao);
}
