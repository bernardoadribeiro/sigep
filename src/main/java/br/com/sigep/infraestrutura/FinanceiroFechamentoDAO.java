package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

import br.com.sigep.entidades.financeiro.FinanceiroFechamento;

public class FinanceiroFechamentoDAO<T extends FinanceiroFechamento> extends DAO<T>{

    // @Autowired
    // protected LogServico log;

    public FinanceiroFechamentoDAO(Class<T> classe) {
        super(classe);
    }
    
    /* Salva objeto (registro) do Fechamento Financeiro */
    @Override
    @Transactional
    public boolean Salvar(T objFechamento) {
        if(objFechamento.getId() == 0){
            objFechamento.setDataCriacao(new Date());
        }
        objFechamento.setUltimaAtualizacao(new Date());

        return super.Salvar(objFechamento);
    }

    /* Atualiza objeto (registro) do Fechamento Financeiro existente */
    @Override
    @Transactional
    public T Atualizar(T objFechamento){
        objFechamento.setUltimaAtualizacao(new Date());
        return super.Atualizar(objFechamento);
    }
    
}
