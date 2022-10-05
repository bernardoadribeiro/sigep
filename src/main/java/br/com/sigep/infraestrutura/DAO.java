package br.com.sigep.infraestrutura;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import br.com.sigep.servicos.Repositorio;

public class DAO<T> implements Repositorio<T> {

    @PersistenceContext
    private EntityManager entityManager;
    private Class<T> classe;
    
    public DAO(Class<T> classe){
        this.classe = classe;
    }

    /*  */
    public EntityManager getEntityManager(){
        return entityManager;
    }

    public Class<T> getClasse(){
        return classe;
    }

    /* Implementacao dos metodos da interface de repositorios. 
     * Implementa os metodos de CRUD.
    */
    @Override
    public T Abrir(String id) {
        // procura e retorna o obj com o id informado

        try {
            return (T) entityManager.find(this.classe, id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    @Transactional
    public boolean Salvar(T obj) {
        // sava o objeto no bd
        try {
            entityManager.persist(obj);
            entityManager.flush();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    @Transactional
    public T Atualizar(T obj) {
        // Atualiza o objeto informado como parametro
        try {
            obj = entityManager.merge(obj); // var obj recebe o objeto informado ja modificado
            entityManager.flush();
            return obj;

        } catch (Exception e) {
            return null;
        }
    }

    @Override
    @Transactional
    public boolean Apagar(T obj) {
        try {
            entityManager.remove(obj);
            entityManager.flush();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    /* (non-Javadoc)
     * @see br.com.sigep.servicos.Repositorio#Buscar(java.lang.Object)
     */
    @Override
    @Transactional
    public List<T> Buscar(T filtro) {
        // Busca usando o objeto usando filtro. Retorna null quando nao encontrado
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(classe);
            Root<T> root = criteriaQuery.from(classe);

            criteriaQuery.select(root);

            Query consulta = entityManager.createQuery(criteriaQuery);

            return consulta.getResultList();

        } catch (Exception e) {
            return null;
        }
        
    }
    
}
