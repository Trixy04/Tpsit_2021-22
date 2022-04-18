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
public class ProdConsSem {

    
    public static void main(String args[]){
        
        Contatore conta = new Contatore(0,1);
        ContatoreX2 contaX2 = new ContatoreX2(0,2);
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod1 = new ProduciDato(pieno, vuoto, conta);
        ProduciDatoX2 prod2 = new ProduciDatoX2(pieno, vuoto, contaX2);
        ConsumaDato cons1 = new ConsumaDato(pieno, vuoto, conta);
        ConsumaDatoX2 cons2 = new ConsumaDatoX2(pieno, vuoto, contaX2);
        prod1.start();
        prod2.start();
        cons1.start();
        cons2.start();
        System.out.println("Main: termine avvio thread.");
    }
    
}
