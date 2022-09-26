package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

import br.com.sigep.entidades.reserva.Reserva;

public class BloqueioDAO<T extends Reserva> extends DAO<T>{

    // @Autowired
    // protected LogServico log;
    
    public BloqueioDAO(Class<T> classe) {
        super(classe);
    }

    /* Salva novo endereco */
    @Override
    @Transactional
    public boolean Salvar(T objBloqueio) {
        if(objBloqueio.getId() == 0){
            objBloqueio.setDataCriacao(new Date());
            //objReserva.setUsuarioCriador(usuarioCriador); // Salva o usuario logado no sistema, repsonsavel pela criacao da Reserva.
        }
        objBloqueio.setUltimaAtualizacao(new Date());
        objBloqueio.setBloqueio(true);
        //objBloqueio.setCodigoReserva(objBloqueio.gerarCodigo(true));

        return super.Salvar(objBloqueio);
    }
    
    /* Atualiza endereco existente */
    @Override
    @Transactional
    public T Atualizar(T objBloqueio){
        objBloqueio.setUltimaAtualizacao(new Date());
        return super.Atualizar(objBloqueio);
    }
    
    
    
}
