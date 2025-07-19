import java.util.Scanner;

public class BEE1074{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        for(int i = 1; i <= n; i++){

            int x = keyboard.nextInt();

            if(x == 0){
                System.out.println("NULL");
            }
            else if(x % 2 == 0){

                if(x > 0){
                    System.out.println("EVEN POSITIVE");
                }
                else{
                    System.out.println("EVEN NEGATIVE");
                }

            }
            else if(x % 2 != 0){

                if(x > 0){
                    System.out.println("ODD POSITIVE");
                }
                else{
                    System.out.println("ODD NEGATIVE");
                }

            }

        }

        keyboard.close();

    }

}