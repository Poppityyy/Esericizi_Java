public class ProvaNani2 {
    public static void main (String [] args) {
        Thread thr1 = new ContaINani2("Nano uno");
        Thread thr2 = new ContaINani2("Nano due");
        thr1.start();
        thr2.start();
    }
}
