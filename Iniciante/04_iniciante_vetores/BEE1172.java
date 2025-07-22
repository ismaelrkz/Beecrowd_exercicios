import java.util.Scanner;

public class BEE1172{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int x[] = new int[10];

        for(int i = 0; i < x.length; i++){

            x[i] = keyboard.nextInt();
            
        }

        for(int i = 0; i < x.length; i++){

            if(x[i] <= 0){

                x[i] = 1;

            }

            System.out.println("X[" + i + "] = " + x[i]);

        }

        keyboard.close();


    }
}