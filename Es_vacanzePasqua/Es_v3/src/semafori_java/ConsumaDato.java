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
public class ConsumaDato extends Thread{
    Semaforo pieno;    
    Semaforo vuoto;
    Contatore conta;
    ProduciDato p = new ProduciDato(pieno, vuoto, conta);
    
    public ConsumaDato(Semaforo s1, Semaforo s2, Contatore conta){
        this.pieno = s1;
        this.vuoto = s2;
        this.conta = conta;
    }
    
    public void run(){
        for(int i = 0; i < p.tanti; i++){
            pieno.P();
            conta.decrementa();
            System.out.println("Lettore: dato letto " + i);
            vuoto.V();
        }
    }
}

