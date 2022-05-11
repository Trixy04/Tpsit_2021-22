public class App extends Thread{
    public static void main(String[] args) throws Exception {
        System.out.println("Il programma e' iniziato");

        Semaforo semUomo = new Semaforo(2);

        Bagno bUomo = new Bagno("M");

        Persona p1 = new Persona("Lorenzo", bUomo, semUomo);
        Persona p2 = new Persona("Antonio", bUomo, semUomo);
        Persona p3 = new Persona("Mattia", bUomo,  semUomo);

        p1.start();
        p2.start();
        p3.start();
    }
}
