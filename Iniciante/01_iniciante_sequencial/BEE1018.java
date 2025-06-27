import java.util.Scanner;

public class BEE1018{

    public static void main(String args[]){
        
        int X, notaResto, notaCem, notaCinq, notaVinte, notaDez, notaCinco, notaDois, notaUm;

        Scanner teclado = new Scanner(System.in);

        X = teclado.nextInt();

        System.out.println(X);
        
        notaCem = X / 100;
        notaResto = X % 100;
        notaCinq = notaResto / 50;
        notaResto = notaResto % 50;
        notaVinte = notaResto / 20;
        notaResto = notaResto % 20;
        notaDez = notaResto / 10;
        notaResto = notaResto % 10;
        notaCinco = notaResto / 5;
        notaResto = notaResto % 5;
        notaDois = notaResto / 2; 
        notaResto = notaResto % 2; 
        notaUm = notaResto / 1; 
        notaResto = notaResto % 1; 

        System.out.println(notaCem + " nota(s) de R$ 100,00");
        System.out.println(notaCinq + " nota(s) de R$ 50,00");
        System.out.println(notaVinte + " nota(s) de R$ 20,00");
        System.out.println(notaDez + " nota(s) de R$ 10,00");
        System.out.println(notaCinco + " nota(s) de R$ 5,00");
        System.out.println(notaDois + " nota(s) de R$ 2,00");
        System.out.println(notaUm + " nota(s) de R$ 1,00");

        teclado.close();

    }
}