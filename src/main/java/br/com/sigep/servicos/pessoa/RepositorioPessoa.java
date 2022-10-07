package br.com.sigep.servicos.pessoa;

import br.com.sigep.entidades.pessoa.Pessoa;
import br.com.sigep.servicos.Repositorio;

public interface RepositorioPessoa extends Repositorio<Pessoa>{
    public Pessoa Abrir(String login);
}
