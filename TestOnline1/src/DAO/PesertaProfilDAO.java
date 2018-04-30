/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.PesertaProfil;

/**
 *
 * @author noname
 */
public interface PesertaProfilDAO extends GeneralDAO{
    public PesertaProfil getById(long id);
    public List<PesertaProfil> getAll();
}
