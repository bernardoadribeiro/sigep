package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.sigep.entidades.quarto.Quarto;
import br.com.sigep.servicos.quarto.RepositorioQuarto;

@Service
public class QuartoDAO extends DAO<Quarto> implements RepositorioQuarto{

    // @Autowired
    // protected LogServico log;

    public QuartoDAO() {
        super(Quarto.class);
    }

    /* Salva novo endereco */
    @Override
    @Transactional
    public boolean Salvar(Quarto objQuarto) {
        if(objQuarto.getId() == 0){
            objQuarto.setDataCriacao(new Date());
        }
        objQuarto.setUltimaAtualizacao(new Date());

        return super.Salvar(objQuarto);
    }
    
    /* Atualiza endereco existente */
    @Override
    @Transactional
    public Quarto Atualizar(Quarto objQuarto){
        objQuarto.setUltimaAtualizacao(new Date());
        return super.Atualizar(objQuarto);
    }
    
}
