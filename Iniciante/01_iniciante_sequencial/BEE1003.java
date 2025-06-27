import java.util.Scanner;

public class BEE1003{

    public static void main(String args[]){

        int A, B, SOMA;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        teclado.close();

    }

}