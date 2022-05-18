public class ContaINani{
    
    class sottoNani1 extends Thread{
        public void run(){
            System.out.println("Sono dentro il ciclo dei nani 1!" + getName());
            for(int i = 0; i < 7; i++){
                System.out.println("Nano: " + (i+1) + ";" ) ;
            }
        }
    }

    public class sottoNani2 extends Thread{
        public void run2(){
            System.out.println("Sono dentro il ciclo dei nani numero 2!" + getName());
            for(int i = 0; i < 7; i++){
                System.out.println("Nani: " + (i+1) + ";" ) ;
            }
        }
    }

    
    }
    

