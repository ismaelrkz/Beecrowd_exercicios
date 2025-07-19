import java.util.Scanner;

public class BEE1060{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int numPositive = 0;

        for(int contador=1; contador<=6; contador++){

            double value = teclado.nextDouble();

            if(value > 0.00){

                numPositive++;

            }

        }

        System.out.println(numPositive + " valores positivos");

        teclado.close();

    }

}