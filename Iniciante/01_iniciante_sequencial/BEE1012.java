import java.util.Scanner;

public class BEE1012{

    public static void main(String args[]){

        double A, B, C, pi;
        double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        TRIANGULO = A * C / 2; 
        CIRCULO = 3.14159 * (C * C);
        TRAPEZIO = ((A + B) * C) / 2;
        QUADRADO = B * B;
        RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);

        teclado.close();

    }

}
