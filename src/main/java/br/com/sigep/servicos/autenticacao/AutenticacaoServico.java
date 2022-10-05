package br.com.sigep.servicos.autenticacao;

import br.com.sigep.entidades.pessoa.Pessoa;

public interface AutenticacaoServico {
    public boolean autenticar(String pessoa, String senha );
    public Pessoa getNome();
}
