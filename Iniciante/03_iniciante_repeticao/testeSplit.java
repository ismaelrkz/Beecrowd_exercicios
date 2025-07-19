import java.util.Scanner;

public class testeSplit{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        //teste 1:

        // String[] entrada = keyboard.nextLine().split(" : "); // no terminal voce deve manualmente colocar o sinal ":".
        // int numeroInteiro = Integer.parseInt(entrada[0]);
        // String textoString = entrada[1];
        // double numeroReal = Double.parseDouble(entrada[2]); 

        // System.out.printf("Idade: %d, Nome: %s, Peso: %.2f\n", numeroInteiro, textoString, numeroReal);

        //teste 2:

        String[] entrada2 = keyboard.nextLine().split(":");
        int hora = Integer.parseInt(entrada2[0]);
        int minuto = Integer.parseInt(entrada2[1]);
        int segundo = Integer.parseInt(entrada2[2]);

        System.out.println(hora + " : " + minuto + " : " + segundo + " : ");

        keyboard.close();

    }

}