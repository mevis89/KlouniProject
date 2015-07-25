/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */
public class GestorePagina{
    
    private Utente[] ListaUtenti;
    private  int numUtenti = 0;
    
    public void GestorePagina(){
        
    }
    
    
    public void registrazione(String nome , String cognome ,String email,String nickname , String psw){
        
        this.ListaUtenti[numUtenti] = new Utente(1,nome,cognome,email,nickname,psw);
        
    }
    
    public void autenticazione (String nickname , String psw){
        
        /**Questo non so bene come imprementarlo**/
    }
}
