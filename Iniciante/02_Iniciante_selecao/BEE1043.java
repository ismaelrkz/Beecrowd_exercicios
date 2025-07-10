import java.util.Scanner;

public class BEE1043{

    public static void main(String args[]){

        double A, B, C, perimetro, area;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if((A + B > C) && (A + C > B) && (B + C > A)){

            perimetro = A + B + C;

            System.out.printf("Perimetro = %.1f\n", perimetro);

        } 
        else {

            area = ((A + B) * C) / 2;

            System.out.printf("Area = %.1f\n", area);

        }

        teclado.close();

    }

}