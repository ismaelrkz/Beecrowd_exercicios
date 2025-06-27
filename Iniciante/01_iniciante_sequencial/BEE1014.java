import java.util.Scanner;

public class BEE1014{

    public static void main(String args[]){

        int X;
        double Y, media;

        Scanner teclado = new Scanner(System.in);

        X = teclado.nextInt();
        Y = teclado.nextDouble();

        media = X / Y;

        System.out.printf("%.3f km/l\n", media);

        teclado.close();

    }

}