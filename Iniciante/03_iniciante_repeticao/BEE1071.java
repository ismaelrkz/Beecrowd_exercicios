import java.util.Scanner;

public class BEE1071{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = 0;

        if(x < y){
            for (int i = ++x; i < y; i++) {

                if(i % 2 != 0){

                    z = z + i;

                }
                
            }
        }
        else if(x > y){
            for (int i = ++y; i < x; i++) {

                if(i % 2 != 0){
                    z = z + i;
                }

            }

        }

        System.out.println(z);

        keyboard.close();

    }

}