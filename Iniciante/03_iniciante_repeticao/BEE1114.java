import java.util.Scanner;

public class BEE1114{
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int password = 0;

        do{

            password = teclado.nextInt();

            if(password != 2002){

                System.out.println("Senha Invalida");

            }
            else{

                System.out.println("Acesso Permitido");

            }

        } while(password != 2002);

        teclado.close();
        
    }

}