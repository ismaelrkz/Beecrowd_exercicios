import java.util.Scanner;

public class BEE1008{
    public static void main(String args[]){
        
        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        Scanner teclado = new Scanner(System.in);

        numeroFuncionario   = teclado.nextInt();
        horasTrabalhadas    = teclado.nextInt();
        valorHora           = teclado.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        teclado.close();

    }
}