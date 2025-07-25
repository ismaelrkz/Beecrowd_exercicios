import java.util.Scanner;

public class BEE1178{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        double x = keyboard.nextDouble();

        double n[] = new double[100];

        n[0] = x;

        for(int i = 1; i < 100; i++){

            n[i] = n[i - 1] / 2.0; // n[i - 1] -> seleciona o valor que está armazenado no indice anterior.

        }

        for(int i = 0; i < 100; i++){

            System.out.printf("N[%d] = %.4f\n", i, n[i] );

        }

        keyboard.close();

    }

}