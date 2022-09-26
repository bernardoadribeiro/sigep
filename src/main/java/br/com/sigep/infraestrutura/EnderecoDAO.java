package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

//import org.springframework.beans.factory.annotation.Autowired;

import br.com.sigep.entidades.endereco.Endereco;

public class EnderecoDAO<T extends Endereco> extends DAO<T> {
    
    // @Autowired
    // protected LogServico log;

    public EnderecoDAO(Class<T> classe) {
        super(classe);
    }
    
    /* Salva novo endereco */
    @Override
    @Transactional
    public boolean Salvar(T objEndereco) {
        if(objEndereco.getId() == 0){
            objEndereco.setDataCriacao(new Date());
        }
        objEndereco.setUltimaAtualizacao(new Date());

        return super.Salvar(objEndereco);
    }
    
    /* Atualiza endereco existente */
    @Override
    @Transactional
    public T Atualizar(T objEndereco){
        objEndereco.setUltimaAtualizacao(new Date());
        return super.Atualizar(objEndereco);
    }

}
