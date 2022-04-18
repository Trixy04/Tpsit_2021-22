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
    int dato;
    ProduciDato p = new ProduciDato(pieno, vuoto);
    
    public ConsumaDato(Semaforo s1, Semaforo s2){
        this.pieno = s1;
        this.vuoto = s2;
    }
    
    public void run(){
        while(true){
            pieno.P();
            dato = ProdConsSem.buffer;
            System.out.println("Lettore: dato letto " + dato);
            vuoto.V();
        }
    }
}

