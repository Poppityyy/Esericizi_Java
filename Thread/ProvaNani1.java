public class ProvaNani1{
    public static void main (String []args){
        ContaINani1 thr1 = new ContaINani1();
        thr1.start();
        System.out.println(Thread.currentThread().getName());
    }
}