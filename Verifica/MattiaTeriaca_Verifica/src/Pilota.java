public class Pilota extends Thread{
    
    String nome;
    Semaforo semaforoSpogliatoio;
    Semaforo semaforoPista;
    Spogliatoio spogliatoio;
    Pista pista;
    double tempoGiri;

    public Pilota(String nome, Semaforo sS, Semaforo sP, Spogliatoio spogliatoio, Pista pista){
        this.nome = nome;
        this.semaforoPista = sP;
        this.semaforoSpogliatoio = sS;
        this.pista = pista;
        this.spogliatoio = spogliatoio;
    }

    public Pilota(String nome, double tempo){
        this.nome = nome;
        this.tempoGiri = tempo;
    }

    public void run(){

        semaforoSpogliatoio.P();
        spogliatoio.usaSpogliatoio(nome);
        semaforoSpogliatoio.V();

        try {
            this.spogliatoio.join();
        } catch (InterruptedException e) {}

        semaforoPista.P();
        pista.usaPista(nome);
        semaforoPista.V();

        try {
            this.pista.join();
        } catch (InterruptedException e) {}
        
        semaforoSpogliatoio.P();
        spogliatoio.usaSpogliatoio(nome);
        semaforoSpogliatoio.V();

    }

}
