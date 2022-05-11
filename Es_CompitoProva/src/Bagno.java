public class Bagno extends Thread{

    String nome;
    String targhetta;

    public Bagno(String t){
        targhetta = t;
    }

    public void usaBagno(String nome){
        System.out.println(targhetta + ": " + nome + " e' entrato in bagno");
        
        try{
            Thread.sleep(1000);
        }catch(Exception e){}

        System.out.println(targhetta + ": " + nome + " e' uscito in bagno");
    }


}