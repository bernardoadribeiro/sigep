package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

//import org.springframework.beans.factory.annotation.Autowired;

import br.com.sigep.entidades.pessoa.Pessoa;

public class PessoaDAO<T extends Pessoa> extends DAO<T>{

    // @Autowired
    // protected LogServico log;

    public PessoaDAO(Class<T> classe) {
        super(classe);
    }

    /* Salva objeto pessoa */
    @Override
    @Transactional
    public boolean Salvar(T obj) {
        if(obj.getId() == 0){
            obj.setDataCriacao(new Date());
        }
        obj.setUltimaAtualizacao(new Date());

        return super.Salvar(obj);
    }
    
}
