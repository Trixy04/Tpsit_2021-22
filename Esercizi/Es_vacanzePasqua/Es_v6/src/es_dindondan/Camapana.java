/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_dindondan;



class Campana implements Runnable{
    
    String suono;
    int volte;
    
    public Campana(String s,int v) {
    this.suono=s;
    this.volte=v;
    }

    public void run(){
        for (int i=0;i<volte;i++)
    {
        System.out.print(suono+" ");
    try{
        Thread.sleep(100); }
    catch(InterruptedException e){}
    }}
    
}


