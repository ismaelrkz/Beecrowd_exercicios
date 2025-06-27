import java.util.Scanner;

public class BEE1004{

    public static void main(String args[]){

        int A, B, PROD;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        teclado.close();

    }

}