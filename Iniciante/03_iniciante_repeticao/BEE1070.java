import java.util.Scanner;

public class BEE1070{
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int init = teclado.nextInt();

        if(init % 2 == 0){
            init++;
        }

        for(int contador = 1; contador <= 6; contador++){

            System.out.println(init);

            init+=2;

        }

        teclado.close();
        
    }

}