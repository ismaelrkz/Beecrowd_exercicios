import java.util.Scanner;

public class BEE1078{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        for(int i=1; i <=10; i++){

            int result = i * n;

            System.out.println(i + " x " + n + " = " + result);

        }

        keyboard.close();

    }

}