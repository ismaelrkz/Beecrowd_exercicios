import java.util.Scanner;

public class BEE1045 {

    public static void main(String[] args) {
        double A, B, C;
        double A2 = 0.0, B1 = 0.0, C0 = 0.0;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        teclado.close();

        
        if (A >= B && A >= C) {
            A2 = A;
            if (B >= C) {
                B1 = B;
                C0 = C;
            } else {
                B1 = C;
                C0 = B;
            }
        } else if (B >= A && B >= C) {
            A2 = B;
            if (A >= C) {
                B1 = A;
                C0 = C;
            } else {
                B1 = C;
                C0 = A;
            }
        } else {
            A2 = C;
            if (A >= B) {
                B1 = A;
                C0 = B;
            } else {
                B1 = B;
                C0 = A;
            }
        }


        if(A2 >= B1 + C0){
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            if((A2 * A2) == (B1 * B1) + (C0 * C0)){
                System.out.println("TRIANGULO RETANGULO");
            }
            else if((A2 * A2) > (B1 * B1) + (C0 * C0)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if((A2 * A2) < (B1 * B1) + (C0 * C0)){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            
            if(A2 == B1 && B1 == C0){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if(A2 == B1 || A2 == C0 || B1 == C0){
                System.out.println("TRIANGULO ISOSCELES");
            }

        }
    }
}
