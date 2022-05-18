public class Pista extends Thread{
    double tempo = 0;
    
    
    /** 
     * @param nome
     */
    
    public void usaPista(String nome){

        System.out.println(nome + " è ENTARTO in pista!");

        try {

            long start = System.nanoTime();
            for(int i = 0; i < 15; i++){
                Thread.sleep((long)(Math.random() * 1000));
            }
            long stop = System.nanoTime();

            tempo = (stop - start)/10000000;

            Pilota p = new Pilota(nome, tempo);
            Classifica.addTempo(p);

        } catch (Exception e) {}

        System.out.println(nome + " è USCITO dalla pista!");

    }
}
