public class Spogliatoio extends Thread{

    public void usaSpogliatoio(String nome){

        System.out.println(nome + " è ENTARTO nello spogliatoio");

        try {

            Thread.sleep(1000);

        } catch (Exception e) {}

        System.out.println(nome + " è USCITO dallo spogliatoio");

    }

}
