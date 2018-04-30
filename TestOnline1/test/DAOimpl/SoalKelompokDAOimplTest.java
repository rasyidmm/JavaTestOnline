/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import java.util.List;
import model.SoalKelompok;
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
public class SoalKelompokDAOimplTest {
    
    public SoalKelompokDAOimplTest() {
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
     * Test of getById method, of class SoalKelompokDAOimpl.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        long id = 0L;
        SoalKelompokDAOimpl instance = new SoalKelompokDAOimpl();
        SoalKelompok expResult = null;
        SoalKelompok result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class SoalKelompokDAOimpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        SoalKelompokDAOimpl instance = new SoalKelompokDAOimpl();
        List<SoalKelompok> expResult = null;
        List<SoalKelompok> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
