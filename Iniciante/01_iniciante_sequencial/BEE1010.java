import java.util.Scanner;

public class BEE1010{
    
    public static void main(String args[]){

        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        double valorPeca1, valorPeca2, valorTotal;

        Scanner teclado = new Scanner(System.in);

        codigoPeca1     = teclado.nextInt();
        quantidadePeca1 = teclado.nextInt();
        valorPeca1      = teclado.nextDouble();
        codigoPeca2     = teclado.nextInt();
        quantidadePeca2 = teclado.nextInt();
        valorPeca2      = teclado.nextDouble();

        valorTotal = (valorPeca1 * quantidadePeca1) + (valorPeca2 * quantidadePeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);


        teclado.close();

    }

}