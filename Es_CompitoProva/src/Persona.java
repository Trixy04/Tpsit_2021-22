public class Persona extends Thread{
    
    String nome;
    Bagno bagno;
    Semaforo s1;

    public Persona(String nome, Bagno b, Semaforo s){
        this.nome = nome;
        bagno = b;
        s1 = s;
    }

    public void run(){
        s1.P();
        bagno.usaBagno(nome);
        s1.V();
    }
}