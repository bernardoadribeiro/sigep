package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

import br.com.sigep.entidades.quarto.Quarto;

public class QuartoDAO<T extends Quarto> extends DAO<T>{

    // @Autowired
    // protected LogServico log;

    public QuartoDAO(Class<T> classe) {
        super(classe);
    }

    /* Salva novo endereco */
    @Override
    @Transactional
    public boolean Salvar(T objQuarto) {
        if(objQuarto.getId() == 0){
            objQuarto.setDataCriacao(new Date());
        }
        objQuarto.setUltimaAtualizacao(new Date());

        return super.Salvar(objQuarto);
    }
    
    /* Atualiza endereco existente */
    @Override
    @Transactional
    public T Atualizar(T objQuarto){
        objQuarto.setUltimaAtualizacao(new Date());
        return super.Atualizar(objQuarto);
    }
    
}
