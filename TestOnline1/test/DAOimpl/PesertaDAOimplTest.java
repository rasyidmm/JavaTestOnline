/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.PesertaDAO;
import Helper.HelperEnkripsi;
import Helper.HelperPeserta;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import model.Peserta;
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
    
//    @Test
//    public void testRegistrasi(){
//        String email = "";
//        String password = "";
//        String repassword = "";
//        
//        boolean sama = HelperPeserta.getSamePassword(password, repassword);
//        assertTrue(sama);
//        PesertaDAO pdao = new PesertaDAOimpl();
//        Peserta peserta = new Peserta();
//        peserta.setEmail(email);
//        peserta.setPassword(password);
//        pdao.insert(peserta);
//        List<Peserta> list = pdao.getAll();
////        long id = list.size();
//        Peserta expResult = new Peserta();
//        for(Peserta result: list){
//           //assertSame(peserta.getEmail(), result.getEmail());
//           if(peserta.getEmail()==result.getEmail()){
//               expResult = result;
//               break;
//           }
//           
//        }
//        assertSame(expResult, peserta);
//    }
//
    /**
     * Test of getAll method, of class PesertaDAOimpl.
     */
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

    /**
     * usecase gagal login
//     */
//    @Test
//    public void testGetLogin() throws NoSuchAlgorithmException{
//        System.out.println("getLogin");
//        String email = "Jaga@gmail.com";
//        String password = "jaga11";
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
//        Peserta result = instance.getLogin(email, password);
//       // assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//        assertNull(result);
//    }
//    
}
