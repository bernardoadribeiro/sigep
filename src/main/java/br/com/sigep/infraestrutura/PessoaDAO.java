package br.com.sigep.infraestrutura;

import java.util.Date;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.sigep.entidades.pessoa.Pessoa;
import br.com.sigep.servicos.pessoa.RepositorioPessoa;

@Service
public class PessoaDAO extends DAO<Pessoa> implements RepositorioPessoa {

    public PessoaDAO() {
        super(Pessoa.class);
    }

    /* Abre pessoa */
    @Override
    public Pessoa Abrir(String email) {
        try {
            Query consulta = getEntityManager()
            .createQuery("select p from pessoas p where p.email = :email");
            consulta.setParameter("email", email);
    
            return (Pessoa) consulta.getSingleResult();
            } catch(Exception ex){
                System.out.println(ex.getMessage());
                return null;
            }
    }

    /* Salva objeto pessoa */
    @Override
    @Transactional
    public boolean Salvar(Pessoa objPessoa) {
        if(objPessoa.getId() == 0){
            objPessoa.setDataCriacao(new Date());
        }
        objPessoa.setUltimaAtualizacao(new Date());

        return super.Salvar(objPessoa);
    }

    /* Atualiza Pessoa existente */
    @Override
    @Transactional
    public Pessoa Atualizar(Pessoa objPessoa){
        objPessoa.setUltimaAtualizacao(new Date());
        return super.Atualizar(objPessoa);
    }
    
}
