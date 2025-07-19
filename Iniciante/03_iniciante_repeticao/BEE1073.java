import java.util.Scanner;

public class BEE1073{
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();

        for(int contador = 2; contador <= N; contador+=2){

                System.out.println(contador + "^2 = " + (contador * contador));

        }


        teclado.close();
        
    }

}