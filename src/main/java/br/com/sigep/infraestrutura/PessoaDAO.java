package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.sigep.entidades.log.LogNivel;

//import org.springframework.beans.factory.annotation.Autowired;

import br.com.sigep.entidades.pessoa.Pessoa;
import br.com.sigep.servicos.log.LogServico;

public class PessoaDAO<T extends Pessoa> extends DAO<T>{

     @Autowired
     protected LogServico log;

    public PessoaDAO(Class<T> classe) {
        super(classe);
    }

    /* Salva objeto pessoa */
    @Override
    @Transactional
    public boolean Salvar(T objPessoa) {
        if(objPessoa.getId() == 0){
            objPessoa.setDataCriacao(new Date());
        }
        objPessoa.setUltimaAtualizacao(new Date());

        log.registrar(LogNivel.Informacao, "Salvar", "Nome");

        return super.Salvar(objPessoa);
    }

    /* Atualiza Pessoa existente */
    @Override
    @Transactional
    public T Atualizar(T objPessoa){
        objPessoa.setUltimaAtualizacao(new Date());
        return super.Atualizar(objPessoa);
    }
    
}
