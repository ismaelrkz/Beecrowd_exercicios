import java.util.Scanner;

public class BEE1006{
    public static void main(String args[]){
        
        double A, B, C, MEDIA;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        A = A * 2;
        B = B * 3;
        C = C * 5;

        MEDIA = (A + B + C) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        teclado.close();

    }
}