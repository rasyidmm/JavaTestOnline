/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DAO.PesertaDAO;
import DAO.PesertaProfilDAO;
import DAO.SoalDAO;
import DAO.SoalKelompokDAO;
import DAO.SoalPilihanJawabanDAO;
import DAO.SoalTypeDAO;
import DAOimpl.PesertaDAOimpl;
import DAOimpl.PesertaProfilDAOimpl;
import DAOimpl.SoalDAOimpl;
import DAOimpl.SoalKelompokDAOimpl;
import DAOimpl.SoalPilihanJawabanDAOimpl;
import DAOimpl.SoalTypeDAOimpl;
import Helper.HelperEnkripsi;
import db.DbConnection;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Peserta;
import model.PesertaProfil;
import model.Soal;
import model.SoalKelompok;
import model.SoalPilihanJawaban;
import model.SoalType;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author noname
 */
public class main {
    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
        
        EntityManager em = DbConnection.getConnection();
        
//======================insert soal Kelompok====================
//        SoalKelompokDAO skdao = new SoalKelompokDAOimpl();
//        SoalKelompok sk = new SoalKelompok();
//        sk.setNama_kelomok_soal("Matematika");
//        skdao.insert(sk);
//=====================insert soal type=========================
//          SoalTypeDAO stdao = new SoalTypeDAOimpl();
//          SoalType st = new SoalType();
//          st.setNama_type_soal("Pilihan");
//          stdao.insert(st);
// ====================insert Soal=============================
//
//          SoalDAO sdao = new SoalDAOimpl();
//          Soal s = new Soal();
//          s.setSoal("apa yang ter jadi");
//          s.setNilai_soal(10);
//          SoalKelompokDAO skdao = new SoalKelompokDAOimpl();
//          SoalKelompok sk = skdao.getById(1);
//          
//          SoalTypeDAO stdao = new SoalTypeDAOimpl();
//          SoalType st = stdao.getById(1);
//          s.setSoalKelompok(sk);
//          s.setSoalType(st);
//          
//          sdao.insert(s);
//======================insert Peserta=============================
//        PesertaDAO pdao = new PesertaDAOimpl();
//      //  List<Peserta> listpeserta = new ArrayList<>();
//        Peserta p = new Peserta();
//        System.out.println(p);
//        p.setEmail("dani@gmail.com");
//        p.setPassword(HelperEnkripsi.hash256("halooini"));
//        pdao.update(p);
//        PesertaProfilDAO ppdao = new PesertaProfilDAOimpl();
//        List<PesertaProfil> listpprofil =  new ArrayList<>();
//        PesertaProfil pp = new PesertaProfil();
//        pdao.insert(p);
//=======================insert peserta n profil========================
//        String pattern = "yyyy-MM-DD";
//       
//        PesertaDAO pdao = new PesertaDAOimpl();
//        Peserta  p =  new Peserta();
//        p.setEmail("Jag1a@gmail.com");
//        p.setPassword(HelperEnkripsi.hash256("ja1ga"));
//        
//        PesertaProfilDAO ppdao = new PesertaProfilDAOimpl();
//        PesertaProfil pp = new PesertaProfil();
//        pp.setNama_peserta("jaga1");
//        pp.setTempat_lahir("Jakarta");
//        pp.setAlamat_peserta("Jakarta");
//        pp.setNo_telp("082123987343");     
//        
//        Date merah;
//        String dateFormat = "";
//        SimpleDateFormat simpledd = new SimpleDateFormat("yyyy/MM/dd");
//        merah = simpledd.parse("1994/09/09");
//        simpledd.applyPattern("yyyy-MM-dd");
//        dateFormat = simpledd.format(merah);
//        pp.setTanggal_lahir(dateFormat);
//        pp.setPeserta(p);//penting
//        pdao.insert(p);
//        ppdao.insert(pp);
//        
//=========================Insert Soalpilihan
//         SoalPilihanJawabanDAO spjdao = new SoalPilihanJawabanDAOimpl();
//         SoalPilihanJawaban spj = new SoalPilihanJawaban();
//         SoalDAO sdao = new SoalDAOimpl();
//         Soal s = sdao.getById(1);
//         spj.setPilihan("A");
//         spj.setPilihanjawaban("indonesia");
//         spj.setKuncijawaban(true);
//         spj.setSoal(s);
//         spjdao.insert(spj);
////        
//===================update type Soal====================
//        SoalTypeDAO stdao = new SoalTypeDAOimpl();
//        SoalType ts = stdao.getById(1);
//        ts.setNama_type_soal("Uraian");
//        stdao.update(ts);
//====================update=============================
//        PesertaDAO pdao = new PesertaDAOimpl();
//        Peserta p = pdao.getById(1);
//        p.setEmail("dono@gmail.com");
//        p.setPassword("heeloo12ss3");
//        pdao.update(p);

//===================================================
//        PesertaDAOimpl instance = new PesertaDAOimpl();
//        //Peserta expResult = null;
//        Peserta result = instance.getLogin(email, password);
//        System.out.println(result.getEmail());
//           String hh = "melihatdia";
//        
//        System.out.println(HelperEnkripsi.hash256(hh));
//        List<Peserta> listp = new ArrayList<>();
//        PesertaDAO pdao =  new PesertaDAOimpl();
//        Peserta listp = (Peserta) pdao.getByEmail();
//        
//        for(Peserta tampil :listp){
//            System.out.println(tampil.getEmail());
//        }
/// System.out.println(pdao.getByEmail("dani176@gmail.com"));//cek email udah ada belum
          
    }
}
