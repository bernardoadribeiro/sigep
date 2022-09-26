package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

import br.com.sigep.entidades.financeiro.FinanceiroDespesa;

public class FinanceiroDespesaDAO<T extends FinanceiroDespesa> extends DAO<T>{

    // @Autowired
    // protected LogServico log;
    
    public FinanceiroDespesaDAO(Class<T> classe) {
        super(classe);
    }

    /* Salva objeto Despesa */
    @Override
    @Transactional
    public boolean Salvar(T objDespesa) {
        if(objDespesa.getId() == 0){
            objDespesa.setDataCriacao(new Date());
        }
        objDespesa.setUltimaAtualizacao(new Date());

        return super.Salvar(objDespesa);
    }

    /* Atualiza Despesa existente */
    @Override
    @Transactional
    public T Atualizar(T objDespesa){
        objDespesa.setUltimaAtualizacao(new Date());
        return super.Atualizar(objDespesa);
    }
    
    
}
