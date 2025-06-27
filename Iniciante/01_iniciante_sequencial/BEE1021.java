import java.util.Scanner;

public class BEE1021{
    
    public static void main(String args[]){

        double valorEntrada;
        int notaCem, notaCinq, notaVinte, notaDez, notaCinco, notaDois;
        int moedaUmR, moedaCinq, moedaVinteCinco, moedaDez, moedaCinco, moedaUmC; 

        Scanner teclado = new Scanner(System.in);

        valorEntrada = teclado.nextDouble();

        int valor = (int)Math.round(valorEntrada * 100); // converter o valor para centavos

        //notas:
        notaCem = valor / 10000;
        valor = valor % 10000;

        notaCinq = valor / 5000;
        valor = valor % 5000;

        notaVinte = valor / 2000;
        valor = valor % 2000;

        notaDez = valor / 1000;
        valor = valor % 1000;

        notaCinco = valor / 500;
        valor = valor % 500;

        notaDois = valor / 200;
        valor = valor % 200;

        //moedas:
        moedaUmR = valor / 100;
        valor = valor % 100;

        moedaCinq = valor / 50; 
        valor = valor % 50;

        moedaVinteCinco = valor / 25;
        valor = valor % 25;

        moedaDez = valor / 10; 
        valor = valor % 10;

        moedaCinco = valor / 5;
        valor = valor % 5;

        moedaUmC = valor;


        System.out.println("NOTAS:");
        System.out.println(notaCem + " nota(s) de R$ 100.00");
        System.out.println(notaCinq + " nota(s) de R$ 50.00");
        System.out.println(notaVinte + " nota(s) de R$ 20.00");
        System.out.println(notaDez + " nota(s) de R$ 10.00");
        System.out.println(notaCinco + " nota(s) de R$ 5.00");
        System.out.println(notaDois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedaUmR + " moeda(s) de R$ 1.00");
        System.out.println(moedaCinq + " moeda(s) de R$ 0.50");
        System.out.println(moedaVinteCinco + " moeda(s) de R$ 0.25");
        System.out.println(moedaDez + " moeda(s) de R$ 0.10");
        System.out.println(moedaCinco + " moeda(s) de R$ 0.05");
        System.out.println(moedaUmC + " moeda(s) de R$ 0.01");

        teclado.close();

    }

}