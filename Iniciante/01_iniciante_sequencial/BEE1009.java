import java.util.Scanner;

public class BEE1009{

    public static void main(String args[]){

        String nome;
        double salarioFixo, valorTotalVendas, valorBonus;
        
        Scanner teclado = new Scanner(System.in);

        nome             = teclado.nextLine();
        salarioFixo      = teclado.nextDouble();
        valorTotalVendas = teclado.nextDouble();

        valorBonus = (valorTotalVendas * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f\n", valorBonus);

        teclado.close();

    }

}