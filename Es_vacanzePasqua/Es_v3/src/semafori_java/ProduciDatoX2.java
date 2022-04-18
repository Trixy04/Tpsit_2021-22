/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semafori_java;

/**
 *
 * @author Mattia
 */
public class ProduciDatoX2 extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    final int attesa = 500;
    ContatoreX2 conta;
        
        public ProduciDatoX2(Semaforo s1, Semaforo s2, ContatoreX2 conta){
            pieno = s1;
            vuoto = s2;
            this.conta = conta;
        }
        
    @Override
        public void run(){
            for(int k = 0; k < tanti; k++){
                vuoto.P();
                conta.incrementa();
                conta.incrementa();
                System.out.println("Scrittore: dato scritto " + k);
                pieno.V();
                try {
                    Thread.sleep(attesa);
                } catch (InterruptedException e) {
                    //Gestione eccezione
                }
            }
            System.out.println("Scrittore: termine scrittura dati.");
        } 
        
        
}
