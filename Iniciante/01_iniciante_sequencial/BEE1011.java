import java.util.Scanner;

public class BEE1011{

    public static void main(String args[]){

        double raio, pi, volume;
        
        Scanner teclado = new Scanner(System.in);

        raio = teclado.nextDouble();

        pi = 3.14159;

        volume = (4.0 / 3.0) * pi * ( raio * raio * raio );

        System.out.printf("VOLUME = %.3f\n", volume);

        teclado.close();

    }

}