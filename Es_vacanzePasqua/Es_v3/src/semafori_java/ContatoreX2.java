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
public class ContatoreX2 {
    int valore;
    int passo;

    public ContatoreX2(int valore, int passo) {
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
        valore = (valore += passo)*2;
    }
    
    void decrementa(){
        valore = (valore -= passo)*2;
    }
        
        
}
