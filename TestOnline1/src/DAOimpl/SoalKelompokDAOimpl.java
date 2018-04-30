/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.SoalKelompokDAO;
import java.util.List;
import model.SoalKelompok;

/**
 *
 * @author noname
 */
public class SoalKelompokDAOimpl extends GeneralDAOimpl implements SoalKelompokDAO{
    public SoalKelompokDAOimpl(){
        super();
    }
    
    @Override
    public SoalKelompok getById(long id) {
        return em.find(SoalKelompok.class, id);
    }

    @Override
    public List<SoalKelompok> getAll() {
        return em.createQuery("from SoalKelompok s").getResultList();
                
    }
    
}
