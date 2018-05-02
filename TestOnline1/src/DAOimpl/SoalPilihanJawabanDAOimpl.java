/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.SoalPilihanJawabanDAO;
import java.util.List;
import model.SoalPilihanJawaban;

/**
 *
 * @author rasyid
 */
public class SoalPilihanJawabanDAOimpl extends GeneralDAOimpl implements SoalPilihanJawabanDAO{

    @Override
    public SoalPilihanJawaban getById(long id) {
        return em.find(SoalPilihanJawaban.class, id);
    }

    @Override
    public List<SoalPilihanJawaban> getAll() {
        return em.createQuery("from SoalPilihanJawaban").getResultList();
    }


    
}
