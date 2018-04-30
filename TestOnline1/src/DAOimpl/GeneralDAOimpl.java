/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.GeneralDAO;
import db.DbConnection;
import javax.persistence.EntityManager;

/**
 *
 * @author noname
 */
public class GeneralDAOimpl implements GeneralDAO{
    protected EntityManager em;
    public GeneralDAOimpl(){
        em = DbConnection.getConnection();
    }
    @Override
    public void insert(Object o) {
        try{
           em.getTransaction().begin();
           em.persist(o);
           em.getTransaction().commit();
       }catch(Exception ex){
           em.getTransaction().rollback();
       }
    }

    @Override
    public void update(Object o) {
       try{
           em.getTransaction().begin();
           em.merge(o);
           em.getTransaction().commit();
       }catch(Exception ex){
           em.getTransaction().rollback();
       }
    }

    @Override
    public void delete(Object o) {
        try{
           em.getTransaction().begin();
           em.remove(o);
           em.getTransaction().commit();
       }catch(Exception ex){
           em.getTransaction().rollback();
       }
    }
    
}
