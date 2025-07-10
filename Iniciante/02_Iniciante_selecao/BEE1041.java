import java.util.Scanner;

public class BEE1041{

    public static void main(String args[]){

        double X, Y;

        Scanner teclado = new Scanner(System.in);

        X = teclado.nextDouble();
        Y = teclado.nextDouble();

        if(X == 0 && Y == 0){
            System.out.println("Origem");
        } 
        else if(Y == 0 && X != 0){
            System.out.println("Eixo X");
        } 
        else if(X == 0 && Y != 0){
            System.out.println("Eixo Y");
        }
        else if(X > 0 && Y > 0){
            System.out.println("Q1");
        }
        else if(X < 0 && Y > 0){
            System.out.println("Q2");
        }
        else if(X < 0 && Y < 0){
            System.out.println("Q3");
        }
        else if(X > 0 && Y < 0){
            System.out.println("Q4");
        }

        teclado.close();

    }

}