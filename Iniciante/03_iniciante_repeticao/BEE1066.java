import java.util.Scanner;

public class BEE1066{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        
        int evenCounter = 0;
        int oddCounter = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;

        for(int counter=1; counter <=5; counter++){

            int N = keyboard.nextInt();

            if(N % 2 == 0){
                evenCounter++;
            }
            else if(N % 2 != 0){
                oddCounter++;
            }

            if(N > 0){
                positiveCounter++;
            }
            else if(N < 0){
                negativeCounter++;   
            }

        }

        System.out.println(evenCounter + " valor(es) par(es)");
        System.out.println(oddCounter + " valor(es) impar(es)");
        System.out.println(positiveCounter + " valor(es) positivo(s)");
        System.out.println(negativeCounter + " valor(es) negativo(s)");

        keyboard.close();

    }

}
