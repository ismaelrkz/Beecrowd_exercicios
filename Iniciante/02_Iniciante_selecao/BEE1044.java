import java.util.Scanner;

public class BEE1044{

    public static void main(String args[]){

        int A, B;        

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();

        if(A % B == 0 || B % A == 0){
            
            System.out.println("Sao Multiplos");

        }
        else{

            System.out.println("Nao sao Multiplos");

        }

        teclado.close();

    }

}