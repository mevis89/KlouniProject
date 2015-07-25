/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */
public class Contatto {
    
    private int idContatto;
    private String nome;
    private String cognome;
    private String email;
    
    public void Contatto(int idContatto,String nome,String cognome,String email){
        
        this.idContatto=idContatto;
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
    }
    
}
