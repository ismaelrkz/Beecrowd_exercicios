import java.util.Scanner;

public class BEE1036{
    
    public static void main(String args[]){

        double A, B, C, delta, R1, R2;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        delta = (B * B) - (4 * A * C);

        if(A == 0 || delta < 0){

            System.out.println("Impossivel calcular");

        } else if(A != 0 && delta >= 0){

            R1 = (-B + Math.sqrt(delta)) / (2 * A);
            R2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);

        }

        teclado.close();

    }

}
