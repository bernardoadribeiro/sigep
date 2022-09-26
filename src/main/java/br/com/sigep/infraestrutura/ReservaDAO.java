package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

import br.com.sigep.entidades.reserva.Reserva;

public class ReservaDAO<T extends Reserva> extends DAO<T>{

    // @Autowired
    // protected LogServico log;
    
    public ReservaDAO(Class<T> classe) {
        super(classe);
    }

    /* Salva novo endereco */
    @Override
    @Transactional
    public boolean Salvar(T objReserva) {
        if(objReserva.getId() == 0){
            objReserva.setDataCriacao(new Date());
            //objReserva.setUsuarioCriador(usuarioCriador); // Salva o usuario logado no sistema, repsonsavel pela criacao da Reserva.
        }
        objReserva.setUltimaAtualizacao(new Date());
        objReserva.setBloqueio(false);
        //objBloqueio.setCodigoReserva(objBloqueio.gerarCodigo(true));

        return super.Salvar(objReserva);
    }
    
    /* Atualiza endereco existente */
    @Override
    @Transactional
    public T Atualizar(T objReserva){
        objReserva.setUltimaAtualizacao(new Date());
        return super.Atualizar(objReserva);
    }
    
}
