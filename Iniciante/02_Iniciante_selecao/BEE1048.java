import java.util.Scanner;

public class BEE1048{
    
    public static void main(String args[]){

        double salario, novoSalario, valorReajuste;
        int percentual;

        novoSalario = 0.00;
        percentual = 0;


        Scanner teclado = new Scanner(System.in);

        salario = teclado.nextDouble();

        if(salario >= 0 && salario <= 400.00){

            novoSalario = salario * 1.15;
            percentual = 15;

        }
        else if(salario >= 400.01 && salario <= 800.00){

            novoSalario = salario * 1.12;
            percentual = 12;

        }
        else if(salario >= 800.01 && salario <= 1200.00){

            novoSalario = salario * 1.10;
            percentual = 10;

        }
        else if(salario >= 1200.01 && salario <= 2000.00){

            novoSalario = salario * 1.07;
            percentual = 7;

        }
        else if(salario > 2000.00){

            novoSalario = salario * 1.04;
            percentual = 4;

        }

        valorReajuste = novoSalario - salario;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
        System.out.println("Em percentual: " + percentual + " %");

        teclado.close();

    }

}

/*
15%
12%
10%
7%
4%
*/