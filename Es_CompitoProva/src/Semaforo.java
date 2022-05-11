public class Semaforo {
    int valore;
    
    public Semaforo(int v){
        valore = v;
    }
    
    synchronized public void P(){
        while(valore == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                //eccezione
            }
        }
        valore--;
    }//fine P
    
    synchronized public void V(){
        valore++;
        notify();
    }
}
