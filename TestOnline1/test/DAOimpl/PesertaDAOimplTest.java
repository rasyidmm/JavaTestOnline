/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.PesertaDAO;
import DAO.PesertaProfilDAO;
import Helper.HelperEnkripsi;
import Helper.HelperPeserta;
import Helper.HelperPesertaNullPassword;
import Helper.HelperValidationPassword;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Peserta;
import model.PesertaProfil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rasyid
 */
public class PesertaDAOimplTest {
    
    public PesertaDAOimplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getById method, of class PesertaDAOimpl.
     */
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        long id = 0L;
//        PesertaDAOimpl instance = new PesertaDAOimpl();
//        Peserta expResult = null;
//        Peserta result = instance.getById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       //
//    }
//    
    @Test
    public void testRegistrasi() throws NoSuchAlgorithmException, ParseException{
        String email = "oQSASwwedewbhhdjwhdbjjbffjsdnsdfknwheddwedQWDQW@gmail";
        String password = "";
        String repassword = "1234589";
        String nama = "oASewfsdfwDawbedjhweaSAqWDQwdjikWS";
        String alamat = "Semarang";
        String tempatLahit = "Semarang";
        //String tanggal = "";
        String nohp = "08213456666";
        Date merah;
        String dateFormat = "";
        SimpleDateFormat simpledd = new SimpleDateFormat("yyyy/MM/dd");
        merah = simpledd.parse("1994/09/09");
        simpledd.applyPattern("yyyy-MM-dd");
        dateFormat = simpledd.format(merah);
//        
        
        boolean benar = HelperPesertaNullPassword.getnullpassword(password);
        assertFalse(benar);
        boolean pass = HelperValidationPassword.cekPanjangPassword(password);
        assertTrue(pass);
        boolean sama = HelperPeserta.getSamePassword(password, repassword);
        assertTrue(sama);
        PesertaDAO pdao = new PesertaDAOimpl();
        Peserta peserta = new Peserta();
        peserta.setEmail(email);
        peserta.setPassword(HelperEnkripsi.hash256(password));
        
        PesertaProfilDAO ppdao = new PesertaProfilDAOimpl();
        PesertaProfil pp = new PesertaProfil();
        pp.setNama_peserta(nama);
        pp.setAlamat_peserta(alamat);
        pp.setTempat_lahir(tempatLahit);
        pp.setNo_telp(nohp);
        pp.setTanggal_lahir(dateFormat);
        pp.setPeserta(peserta);
        pdao.insert(peserta);
        ppdao.insert(pp);
        List<Peserta> list = pdao.getAll();
        long id = list.size();
        Peserta expResult = new Peserta();
        for(Peserta result: list){
           assertSame(peserta.getEmail(), result.getEmail());
           if(peserta.getEmail()==result.getEmail()){
               expResult = result;
               break;
           }
           
        }
        assertNotSame(expResult, peserta);
    }

//    /**
//     * Test of getAll method, of class PesertaDAOimpl.
//     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        PesertaDAOimpl instance = new PesertaDAOimpl();
//        List<Peserta> expResult = null;
//        List<Peserta> result = instance.getAll();
//        assertNotEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }
//
//    /**
//     * usecase gagal login
////     */
//    @Test
//    public void testGetLogin() throws NoSuchAlgorithmException{
//        System.out.println("getLogin");
//        String email = "Jag1a@gmail.com";
//        String password = "ja1ga";
//        PesertaDAOimpl instance = new PesertaDAOimpl();
//        Peserta result = null;
//        boolean exit = instance.getExisEmail(email);
//        if (exit == true){
//            result = instance.getLogin(email,HelperEnkripsi.hash256(password));
//            if(result == null){
//                fail ("password salah");
//            }
//            assertNotNull(result);
//        }else{
//            fail("email tidak ada");
//        }
//        //Peserta result = instance.getLogin(email, password);
//       // assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//        assertNotNull(result);
//    }
//    
}
