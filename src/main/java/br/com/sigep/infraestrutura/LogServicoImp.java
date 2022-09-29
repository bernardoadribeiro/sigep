package br.com.sigep.infraestrutura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.sigep.entidades.log.Log;
import br.com.sigep.entidades.log.LogNivel;
import br.com.sigep.servicos.autenticacao.AutenticacaoServico;
import br.com.sigep.servicos.log.LogRepositorio;
import br.com.sigep.servicos.log.LogServico;

@Service
@Scope("singleton")
public class LogServicoImp implements LogServico{
    
    @Autowired
    private AutenticacaoServico autenticacao;

    @Autowired
    private LogRepositorio repositorio;

    @Override
    public void registrar(LogNivel nivel, String acao, String descricao){

        Log l = new Log(nivel, autenticacao.getNome(), acao, descricao);

        repositorio.Salvar(l);
    }

    @Override
    public void registrar(LogNivel nivel, String acao){
        registrar(nivel, acao, "");


    }
}

