import java.util.Scanner;

public class BEE1007{

    public static void main(String args[]){
        
        int A, B, C, D, DIF;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        DIF = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + DIF);

        teclado.close();

    }

}