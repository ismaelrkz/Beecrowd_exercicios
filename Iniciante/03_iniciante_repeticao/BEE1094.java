import java.util.Scanner;

public class BEE1094{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        int n = Integer.parseInt(keyboard.nextLine());

        for (int i = 0; i < n; i++){

            String[] entrada = keyboard.nextLine().split(" ");
            int quantidade = Integer.parseInt(entrada[0]);
            String tipo = entrada[1];

            switch(tipo){
                case "C":
                    totalCoelhos += quantidade;
                    break;
                case "R":
                    totalRatos += quantidade;
                    break;
                case "S":
                    totalSapos += quantidade;
                    break;
            }

        }

        int totalCobaias = totalCoelhos + totalRatos + totalSapos;
        double percentualCoelhos = (totalCoelhos * 100.0) / totalCobaias;
        double percentualRatos = (totalRatos * 100.0) / totalCobaias;
        double percentualSapos = (totalSapos * 100.0) / totalCobaias;

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos); 
        System.out.printf("Percentual de sapos: %.2f %%\n" , percentualSapos); 

        keyboard.close();

    }

}