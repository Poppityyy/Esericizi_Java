import java.util.Scanner;

public class Cerchio {

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
        System.out.println("Inserire dimensiori raggio:");

        float raggio = in.nextFloat();
        in.close();
        float diametro;
        float perimetro;
        float area;

	    diametro = 2 * raggio;
	    perimetro = 2 * (float)Math.PI * raggio;
	    area = (float)Math.PI * (raggio * raggio);

        System.out.println("Diametro = " + diametro);
        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);
    }
}