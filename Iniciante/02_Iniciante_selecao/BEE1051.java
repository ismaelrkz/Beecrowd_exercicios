import java.util.Scanner;

public class BEE1051{

    public static void main(String args[]){

        double salario, calculoImposto, valorImposto;

        Scanner teclado = new Scanner(System.in);

        salario = teclado.nextDouble();

        if(salario >= 0.00 && salario <= 2000.00){
            
            System.out.println("Isento");
            
        }
        else if(salario > 2000.00 && salario <= 3000.00){ //8%

            salario = salario - 2000;
            calculoImposto = salario * 0.08;

            System.out.printf("R$ %.2f\n", calculoImposto);
            
        }
        else if(salario > 3000.00 && salario <= 4500.00){ //18%

            salario = salario - 3000;
            calculoImposto = (salario * 0.18) + (1000.00 * 0.08);
            
            System.out.printf("R$ %.2f\n", calculoImposto);
            
        }
        else if(salario > 4500.00){ //28%

            salario = salario - 4500;
            calculoImposto = (salario * 0.28) + (1000.00 * 0.08) + (1500.00 * 0.18);

            System.out.printf("R$ %.2f\n", calculoImposto);
            
        }

        teclado.close();

    }

}