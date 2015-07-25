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
public class UtenteTest extends TestCase {
    
    public UtenteTest(String testName) {
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
     * Test of Utente method, of class Utente.
     */
    public void testUtente() {
        System.out.println("Utente");
        int stato = 0;
        String nome = "";
        String cognome = "";
        String email = "";
        String nickname = "";
        String psw = "";
        Utente instance = null;
        instance.Utente(stato, nome, cognome, email, nickname, psw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStato method, of class Utente.
     */
    public void testGetStato() {
        System.out.println("getStato");
        Utente instance = null;
        int expResult = 0;
        int result = instance.getStato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStato method, of class Utente.
     */
    public void testSetStato() {
        System.out.println("setStato");
        int stato = 0;
        Utente instance = null;
        instance.setStato(stato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Utente.
     */
    public void testGetNome() {
        System.out.println("getNome");
        Utente instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Utente.
     */
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Utente instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCognome method, of class Utente.
     */
    public void testGetCognome() {
        System.out.println("getCognome");
        Utente instance = null;
        String expResult = "";
        String result = instance.getCognome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCognome method, of class Utente.
     */
    public void testSetCognome() {
        System.out.println("setCognome");
        String cognome = "";
        Utente instance = null;
        instance.setCognome(cognome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Utente.
     */
    public void testGetEmail() {
        System.out.println("getEmail");
        Utente instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Utente.
     */
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Utente instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNickname method, of class Utente.
     */
    public void testGetNickname() {
        System.out.println("getNickname");
        Utente instance = null;
        String expResult = "";
        String result = instance.getNickname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNickname method, of class Utente.
     */
    public void testSetNickname() {
        System.out.println("setNickname");
        String nickname = "";
        Utente instance = null;
        instance.setNickname(nickname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPsw method, of class Utente.
     */
    public void testGetPsw() {
        System.out.println("getPsw");
        Utente instance = null;
        String expResult = "";
        String result = instance.getPsw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPsw method, of class Utente.
     */
    public void testSetPsw() {
        System.out.println("setPsw");
        String psw = "";
        Utente instance = null;
        instance.setPsw(psw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invio method, of class Utente.
     */
    public void testInvio() {
        System.out.println("invio");
        int tipoMessaggio = 0;
        Utente instance = null;
        instance.invio(tipoMessaggio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of letturaMessaggio method, of class Utente.
     */
    public void testLetturaMessaggio() {
        System.out.println("letturaMessaggio");
        Utente instance = null;
        instance.letturaMessaggio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancellazioneMessaggio method, of class Utente.
     */
    public void testCancellazioneMessaggio() {
        System.out.println("cancellazioneMessaggio");
        Utente instance = null;
        instance.cancellazioneMessaggio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
