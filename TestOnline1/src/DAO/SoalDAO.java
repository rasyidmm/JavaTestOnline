/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Soal;

/**
 *
 * @author noname
 */
public interface SoalDAO extends GeneralDAO{
    public Soal getById(long id);
    public List<Soal> getAll();
}
