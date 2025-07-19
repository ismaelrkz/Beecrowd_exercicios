import java.util.Scanner;

public class BEE1072{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int inCounter = 0;
        int outCounter = 0;

        for(int i = 1; i <= n; i++){

            int x = keyboard.nextInt();

            if(x >= 10 && x <= 20){

                inCounter++;

            }
            else if(x < 10 || x > 20){

                outCounter++;

            }

        }

        System.out.println(inCounter + " in");
        System.out.println(outCounter + " out");

        keyboard.close();

    }

}