/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Peserta;

/**
 *
 * @author noname
 */
public interface PesertaDAO  extends GeneralDAO{
    public Peserta getById(long id);
    public List<Peserta> getAll();
    public Peserta getLogin(String email, String password);
    public Peserta getByEmail(String email);
    public boolean getExisEmail(String email);
}
