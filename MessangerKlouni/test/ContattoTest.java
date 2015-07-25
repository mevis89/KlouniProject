/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author Anna
 */
public class ContattoTest extends TestCase {
    
    public ContattoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of Contatto method, of class Contatto.
     */
    public void testContatto() {
        System.out.println("Contatto");
        int idContatto = 0;
        String nome = "";
        String cognome = "";
        String email = "";
        Contatto instance = new Contatto();
        instance.Contatto(idContatto, nome, cognome, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
