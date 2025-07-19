import java.util.Scanner;

public class BEE1142{
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();

        int pum = 1;

        for(int contador = 1; contador <= N; contador++){

            System.out.println(pum + " " + (pum+1) + " " + (pum+2) + " PUM");

            pum+=4;

        }

        teclado.close();
        
    }

}