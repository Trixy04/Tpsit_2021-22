public class ContaINani extends Thread{
    
    public void run(){
        System.out.println("Sono dentro il ciclo dei nani!");
        for(int i = 0; i < 7; i++){
            System.out.println("Nano: " + (i+1) + ";" ) ;
        }
    }
}
