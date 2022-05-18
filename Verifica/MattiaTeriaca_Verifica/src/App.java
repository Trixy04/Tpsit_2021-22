public class App extends Thread{
    
    /** 
     * @param args
     * @throws Exception
     */
    
    public static void main(String[] args) throws Exception {
        
        Semaforo semaforoPista = new Semaforo(4);
        Semaforo semaforoSpogliatoio = new Semaforo(2);
        Spogliatoio spogliatoio = new Spogliatoio();
        Pista pista = new Pista();

        Pilota p1 = new Pilota("Tommaso", semaforoSpogliatoio, semaforoPista, spogliatoio, pista);
        Pilota p2 = new Pilota("Marco", semaforoSpogliatoio, semaforoPista, spogliatoio, pista);
        Pilota p3 = new Pilota("Giulio", semaforoSpogliatoio, semaforoPista, spogliatoio, pista);
        Pilota p4 = new Pilota("Matteo", semaforoSpogliatoio, semaforoPista, spogliatoio, pista);
        Pilota p5 = new Pilota("Andrea", semaforoSpogliatoio, semaforoPista, spogliatoio, pista);
        Pilota p6 = new Pilota("Christian", semaforoSpogliatoio, semaforoPista, spogliatoio, pista);
        Pilota p7 = new Pilota("Mattia", semaforoSpogliatoio, semaforoPista, spogliatoio, pista);
        Pilota p8 = new Pilota("Elia", semaforoSpogliatoio, semaforoPista, spogliatoio, pista);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        System.out.println("");
        System.out.println("!!! TUTTI SI SONO CAMBIATI E HANNO FINITO DI GIRARE !!!");

        System.out.println("");
        System.out.println("### CLASSIFICA FINALE ###");

        

        for(int i = 0; i < Classifica.classificagara.size(); i++){
            System.out.println((i+1) + "° POSTO: " + Classifica.classificagara.get(i).nome + " ha effettuato un tempo di: " + Classifica.classificagara.get(i).tempoGiri + " sec;");
        }



    }


}
