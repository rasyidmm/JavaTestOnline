/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.PesertaProfilDAO;
import java.util.List;
import model.PesertaProfil;

/**
 *
 * @author noname
 */
public class PesertaProfilDAOimpl extends GeneralDAOimpl implements PesertaProfilDAO{

    public PesertaProfilDAOimpl(){
        super();
    }
    @Override
    public PesertaProfil getById(long id) {
        return em.find(PesertaProfil.class, id);
    }

    @Override
    public List<PesertaProfil> getAll() {
        return em.createQuery("from PeseertaProfil p").getResultList();
    }

    @Override
    public List<PesertaProfil> getByname() {
        return em.createQuery("from p.nama_peserta from PesertaProfil p").getResultList();
    }
    
}
