import java.util.Scanner;

public class BEE1173{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int n[] = new int[10];
        int v = keyboard.nextInt();

        n[0] = v;

        for(int i = 1; i < n.length; i++){

            n[i] = n[i - 1] * 2; // n[i - 1] - seleciona o valor do indice anterior.

        } 

        for(int i = 0; i < n.length; i++){

            System.out.println("N[" + i + "] = " + n[i]);

        }

        keyboard.close();

    }

}