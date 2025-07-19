import java.util.Scanner;

public class BEE1065{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int evenCounter = 0;

        for(int counter=1; counter <=5; counter++){

            int N = keyboard.nextInt();

            if(N % 2 == 0){

                evenCounter++;

            }

        }

        System.out.println(evenCounter + " valores pares");

        keyboard.close();

    }

}