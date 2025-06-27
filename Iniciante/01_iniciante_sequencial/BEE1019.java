import java.util.Scanner;

public class BEE1019{
    public static void main(String args[]){

        int N, horas, minutos, segundos;

        Scanner teclado = new Scanner(System.in);

        N = teclado.nextInt();
        
        horas = (N / 60) / 60;
        minutos = (N / 60) % 60;
        segundos = N % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos );

        teclado.close();

    }
}