/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.SoalKelompok;

/**
 *
 * @author noname
 */
public interface SoalKelompokDAO extends GeneralDAO{
    public SoalKelompok getById(long id);
    public List<SoalKelompok> getAll(); 
}
