import java.util.Scanner;

public class BEE1075{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        for(int i = 1; i <= 10000; i++){

            if(i % n == 2){
                System.out.println(i);
            }

        }

        keyboard.close();

    }

}