/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.PesertaDAO;
import java.util.List;
import model.Peserta;
import static model.Peserta_.email;

/**
 *
 * @author noname
 */
public class PesertaDAOimpl extends GeneralDAOimpl implements PesertaDAO{
    public PesertaDAOimpl(){
        super();
    }
    
    @Override
    public Peserta getById(long id) {
       return em.find(Peserta.class, id);
    }

    @Override
    public List<Peserta> getAll() {
        return em.createQuery("from Peserta b").getResultList();
    }

    @Override
    public Peserta getLogin(String email, String password) {
        Peserta test = null;
        try{
        return test = (Peserta) em.createQuery("select e from Peserta e where e.email=?1 and e.password=?2")
                .setParameter(1, email).setParameter(2, password).getSingleResult();
        }catch(Exception ex){
        
        }
        return test;
    }

    @Override
    public Peserta getByEmail(String email) {
        return (Peserta) em.createQuery("select p from Peserta p where p.email like ?1").setParameter(1, email).getSingleResult();
      //  for 
    }


    


}
