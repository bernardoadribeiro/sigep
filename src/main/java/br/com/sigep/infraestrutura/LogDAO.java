package br.com.sigep.infraestrutura;

import br.com.sigep.entidades.log.Log;
import br.com.sigep.servicos.log.LogRepositorio;

public class LogDAO extends DAO<Log> implements LogRepositorio{
    
    public LogDAO() {
        super(Log.class);

    }
}
