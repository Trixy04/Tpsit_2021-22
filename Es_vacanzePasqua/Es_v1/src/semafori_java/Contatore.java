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
public class Contatore {
    int valore;
    int passo;

    public Contatore(int valore, int passo) {
        this.valore = valore; 
        this.passo = passo;
        System.out.println("\nIl contatore è nato e vale " + this.getValore());
    }

    public int getValore() {
        return valore;
    }

    public int getPasso() {
        return passo;
    }
    
    void incrementa(){
        valore += passo;
    }
    
    void decrementa(){
        valore -= passo;
    }
        
        
}
