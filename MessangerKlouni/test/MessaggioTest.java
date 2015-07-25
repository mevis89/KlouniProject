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
public class MessaggioTest extends TestCase {
    
    public MessaggioTest(String testName) {
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
     * Test of Messaggio method, of class Messaggio.
     */
    public void testMessaggio() {
        System.out.println("Messaggio");
        int idMessaggio = 0;
        int data = 0;
        String testo = "";
        Messaggio instance = new Messaggio();
        instance.Messaggio(idMessaggio, data, testo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
