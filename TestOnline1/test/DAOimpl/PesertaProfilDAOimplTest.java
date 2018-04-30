/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import java.util.List;
import model.PesertaProfil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author noname
 */
public class PesertaProfilDAOimplTest {
    
    public PesertaProfilDAOimplTest() {
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
     * Test of getById method, of class PesertaProfilDAOimpl.
     */
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        long id = 1;
//        PesertaProfilDAOimpl instance = new PesertaProfilDAOimpl();
//        PesertaProfil expResult = null;
//        PesertaProfil result = instance.getById(id);
//        assertNotEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }

    /**
     * Test of getAll method, of class PesertaProfilDAOimpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PesertaProfilDAOimpl instance = new PesertaProfilDAOimpl();
        List<PesertaProfil> expResult = null;
        List<PesertaProfil> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
