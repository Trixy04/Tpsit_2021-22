public class App {
    public static void main(String[] args) throws Exception {
        ContaINani contanani = new ContaINani();
        ContaINani.sottoNani1 sottoNano1 = contanani.new sottoNani1();
        ContaINani.sottoNani2 sottoNano2 = contanani.new sottoNani2();
        System.out.println("Sono nel MAIN - - >");
        sottoNano1.run();
        sottoNano2.run2();
        System.out.println("Fine!");
    }
}
