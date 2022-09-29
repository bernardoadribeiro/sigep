package br.com.sigep.infraestrutura;

import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sigep.entidades.pessoa.Pessoa;
import br.com.sigep.servicos.autenticacao.AutenticacaoServico;
import br.com.sigep.servicos.pessoa.RepositorioPessoa;

@Service
@Scope("singleton")
public class AutenticacaoServicoImp implements AutenticacaoServico {
    private Pessoa pessoa;

    @Autowired
    private RepositorioPessoa repositorio;

    public AutenticacaoServicoImp() {
        this.pessoa = null;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        pessoa = repositorio.Abrir(login);
        if(pessoa != null){
            if(pessoa.getSenha().equals(senha)){
                return true;
            } else {
                pessoa = null;
            }
        }
        return false;
    }

    @Override
    public Pessoa getNome() {
        return pessoa;
    }
}

