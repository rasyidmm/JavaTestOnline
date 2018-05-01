/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class PesertaDAOTest {
    
    public PesertaDAOTest() {
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
     * Test of getById method, of class PesertaDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        long id = 0L;
        PesertaDAO instance = new PesertaDAOImpl();
        Peserta expResult = null;
        Peserta result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PesertaDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PesertaDAO instance = new PesertaDAOImpl();
        List<Peserta> expResult = null;
        List<Peserta> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class PesertaDAO.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        String email = "";
        String password = "";
        PesertaDAO instance = new PesertaDAOImpl();
        Peserta expResult = null;
        Peserta result = instance.getLogin(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByEmail method, of class PesertaDAO.
     */
    @Test
    public void testGetByEmail() {
        System.out.println("getByEmail");
        String email = "";
        PesertaDAO instance = new PesertaDAOImpl();
        Peserta expResult = null;
        Peserta result = instance.getByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExisEmail method, of class PesertaDAO.
     */
    @Test
    public void testGetExisEmail() {
        System.out.println("getExisEmail");
        String email = "";
        PesertaDAO instance = new PesertaDAOImpl();
        boolean expResult = false;
        boolean result = instance.getExisEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PesertaDAOImpl implements PesertaDAO {

        public Peserta getById(long id) {
            return null;
        }

        public List<Peserta> getAll() {
            return null;
        }

        public Peserta getLogin(String email, String password) {
            return null;
        }

        public Peserta getByEmail(String email) {
            return null;
        }

        public boolean getExisEmail(String email) {
            return false;
        }
    }
    
}
