/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */
public class GestoreMessaggi {
    
 private Contatto[] ListaContatti;
 private Messaggio[] ListaMessaggi;
 
 public void messaggioUnicast(String testo , Contatto destinatario){
     
 
 }
 
 public void messaggioMulticast(String testo, Contatto[] listaContatti){
     
 }
 
 public void messaggioBroadcast(String testo){
     
 }
 
 public String selezionaMessaggi(int[] idMessaggio){
     
     //return ListaMessaggi[idMessaggio]
 }
 
 public Messaggio[] cancellazioneMessaggio(int[] idMessaggio){
     
     //** Qui verranno individuati i messaggi con un certo id e tolti dalla lista
      // totale dei messaggi e verrà restituita la lista aggiornata dei messaggi**//
     return ListaMessaggi;
 }
    
}
