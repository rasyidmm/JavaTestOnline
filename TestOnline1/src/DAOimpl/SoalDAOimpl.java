/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.SoalDAO;
import java.util.List;
import model.Soal;

/**
 *
 * @author noname
 */
public class SoalDAOimpl extends GeneralDAOimpl implements SoalDAO{
    public SoalDAOimpl(){
        super();
    }
    @Override
    public Soal getById(long id) {
        return em.find(Soal.class, id);
    }

    @Override
    public List<Soal> getAll() {
        return em.createQuery("from Soal s").getResultList();
    }
    
}
