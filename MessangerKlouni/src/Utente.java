/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */
public class Utente extends GestoreMessaggi {
    
    private int stato ;
    private String nome;
    private String cognome;
    private String email;
    private String nickname;
    private String psw;

    Utente(int i, String nome, String cognome, String email, String nickname, String psw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    public void Utente(int stato , String nome , String cognome, String email , String nickname , String psw){
      
    this.stato=stato;
    this.nome=nome;
    this.cognome=cognome;
    this.email=email;
    this.nickname=nickname;
    this.psw=psw;
    }
    
    public int getStato(){
        
      return this.stato;  
    }
    
    public void setStato(int stato){
        
        this.stato = stato;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public void setCognome(String cognome){
        
        this.cognome = cognome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        
        this.email = email;
    }
    
    public String getNickname(){
        return this.nickname;
    }
    
    public void setNickname(String nickname){
        
        this.nickname = nickname;
    }
    
    public String getPsw(){
        return this.psw;
    }
    
    public void setPsw(String psw){
        
        this.psw = psw;
    }
    
    public void invio(int tipoMessaggio,String testo, Contatto[] destinatario){
        
        if (tipoMessaggio==1)
        {
        messaggioUnicast(testo,destinatario[0]);
    }else{if(tipoMessaggio==2){
        
        messaggioMulticast(testo,destinatario);
    }else{
        messaggioBroadcast(testo);
    }
            
            }
        
    }
    
    public String letturaMessaggio(int idMessaggio){
        
        return selezionaMessaggi(idMessaggio);
        
    }
    
    public Messaggio[] cancellazioneMessaggio(int[] idMessaggio){
        
        return cancellazioneMessaggio(idMessaggio);
        
    }
}
