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
public class GestorePaginaTest extends TestCase {
    
    public GestorePaginaTest(String testName) {
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
     * Test of GestorePagina method, of class GestorePagina.
     */
    public void testGestorePagina() {
        System.out.println("GestorePagina");
        GestorePagina instance = new GestorePagina();
        instance.GestorePagina();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrazione method, of class GestorePagina.
     */
    public void testRegistrazione() {
        System.out.println("registrazione");
        String nome = "";
        String cognome = "";
        String email = "";
        String nickname = "";
        String psw = "";
        GestorePagina instance = new GestorePagina();
        instance.registrazione(nome, cognome, email, nickname, psw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
