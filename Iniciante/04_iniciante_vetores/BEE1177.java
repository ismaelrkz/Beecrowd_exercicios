import java.util.Scanner;

public class BEE1177{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int T = keyboard.nextInt();

        int N[] = new int[1000];

        for(int i = 0; i < 1000; i++){

            N[i] = i % T;

        }

        for(int i = 0; i < 1000; i++){

            System.out.println("N["+ i + "] = " + N[i]);

        }

        keyboard.close();

    }

}