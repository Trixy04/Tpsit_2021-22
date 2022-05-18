/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_dindondan;

/**
 *
 * @author Mattia
 */
public class Es_DINDONDAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Campana cdin = new Campana("DIN DON DAN",3);
        Thread tdin = new Thread(cdin);
        Campana cdon = new Campana("DIN DON DAN",3);
        Thread tdon = new Thread(cdon);
        Thread tdan = new Thread(new Campana("DIN DON DAN",3));
        tdin.start();
        tdon.start();
        tdan.start();}
        }
    

