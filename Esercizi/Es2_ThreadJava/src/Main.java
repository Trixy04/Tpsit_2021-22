public class Main {
    public static void main(String[] args) throws Exception {
        Salvadanaio s = new Salvadanaio();

        Azione inserisciMonete = new Azione(s, true);
        inserisciMonete.start();

        Azione prelevaMonete = new Azione(s, false);
        prelevaMonete.start();

        System.out.println("I threads sono partiti");

        inserisciMonete.join();
        prelevaMonete.join();

        System.out.println("I threads hanno finito");
        System.out.println(Salvadanaio.monete);

    }
}
