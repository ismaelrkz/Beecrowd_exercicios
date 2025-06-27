import java.util.Scanner;

public class BEE1038V2{

    public static void main(String args[]){

        int codigo, quantidade;
        double total = 0.0;

        Scanner teclado = new Scanner(System.in);
        
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        switch(codigo){
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default:
                System.out.println("Valor inválido");
        }

        System.out.printf("Total: R$ %.2f\n", total);

        teclado.close();

    }

}