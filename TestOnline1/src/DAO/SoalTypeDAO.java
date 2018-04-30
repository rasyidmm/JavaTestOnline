/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.SoalType;

/**
 *
 * @author noname
 */
public interface SoalTypeDAO extends GeneralDAO{
    public SoalType getById(long id);
    public List<SoalType> getAll();
}
