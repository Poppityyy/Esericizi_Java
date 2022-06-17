public class Dindondan {
    public static void main (String args[]) {
        Runnable cam1 = new Campana ("Din", 5);
        Thread thr1 = new Thread(cam1);
        thr1.start();
        Thread thr2 = new Thread (new Campana ("Don", 5));
        thr2.start();
        new Thread(new Campana("DAN", 5)).start();
    }
}
