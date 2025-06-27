import java.util.Scanner;

public class BEE1005{

    public static void main(String args[]){

        double A, B, MEDIA;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        A = A * 3.5;
        B = B * 7.5;

        MEDIA = (A + B) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

        teclado.close();

    }

}