import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class vettore {
    public static void main(String[] args) {

        int count;

        Scanner in = new Scanner(System.in);
        Vector vector = new Vector<>();

        System.out.println("Numero di elementi del vettore: ");
        count = in.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Posizione nel vettore " + (i + 1) + ": ");
            vector.add(in.next());
        }

        Iterator iterator = vector.iterator();

        System.out.println("Numeri del vettore");
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
        in.close();
        }
    }
}