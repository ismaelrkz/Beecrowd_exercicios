import java.util.Scanner;

public class BEE1015{

    public static void main(String args[]){

        double x1, y1, x2, y2, termo1, termo2, distancia;
        
        Scanner teclado = new Scanner(System.in);

        x1 = teclado.nextFloat(); 
        y1 = teclado.nextFloat(); 
        x2 = teclado.nextFloat(); 
        y2 = teclado.nextFloat();

        termo1 = (x2 - x1) * (x2 - x1);
        termo2 = (y2 - y1) * (y2 - y1);

        distancia = Math.sqrt(termo1 + termo2);c // sqrt - raiz quadrada

        System.out.printf("%.4f\n", distancia);

        teclado.close();

    }

}
