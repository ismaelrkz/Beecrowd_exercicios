import java.util.Scanner;

public class BEE1175{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int N[] = new int[20];

        for(int i = 0; i < N.length; i++){

            N[i] = keyboard.nextInt();

        }

        for (int i = 0; i < N.length / 2; i++) {
        
            int temp = N[i];            // Guarda o valor da esquerda: N[0,9]
            N[i] = N[N.length - 1 - i]; // Coloca o valor da direita na esquerda: N[0,9] = N[19,10]
            N[N.length - 1 - i] = temp; // Coloca o valor guardado na direita: N[19,10] = N[0,9]

        }

        for(int i = 0; i < N.length; i++){

            System.out.println("N[" + i + "] = " + N[i]);

        }

        keyboard.close();

    }

}