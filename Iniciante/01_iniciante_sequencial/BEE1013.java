import java.util.Scanner;

public class BEE1013{

    public static void main(String args[]){

        int A, B, C;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2; // abs = valor absoluto
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maiorABC + " eh o maior");

        teclado.close();

    }

}