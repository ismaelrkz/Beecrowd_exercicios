import java.util.Scanner;

public class BEE1016{

    public static void main(String args[]){

        int distancia, tempo;

        Scanner teclado = new Scanner(System.in);

        distancia = teclado.nextInt();

        tempo = distancia * 2;


        System.out.println(tempo + " minutos");

        teclado.close();

    }

}