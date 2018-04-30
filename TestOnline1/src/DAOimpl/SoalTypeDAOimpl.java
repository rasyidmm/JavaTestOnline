/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.SoalTypeDAO;
import java.util.List;
import model.SoalType;

/**
 *
 * @author noname
 */
public class SoalTypeDAOimpl extends GeneralDAOimpl implements SoalTypeDAO{
    public SoalTypeDAOimpl(){
        super();
    }
    
    @Override
    public SoalType getById(long id) {
        return em.find(SoalType.class, id);
    }

    @Override
    public List<SoalType> getAll() {
        return em.createQuery("from SoalType").getResultList();
    }
    
}
