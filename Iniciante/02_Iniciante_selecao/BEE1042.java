import java.util.Scanner;

public class BEE1042{

    public static void main(String args[]){

        int V1, V2, V3;
        int A = 0, B = 0, C = 0;

        Scanner teclado = new Scanner(System.in);

        V1 = teclado.nextInt();
        V2 = teclado.nextInt();
        V3 = teclado.nextInt();

        if(V1 < V2 && V1 < V3){

            A = V1;

            if(V2 < V3){
                B = V2;
                C = V3;
            } 
            else if(V2 > V3){
                B = V3;
                C = V2;
            }

        }
        else if(V2 < V1 && V2 < V3){

            A = V2;

            if(V1 < V3){
                B = V1;
                C = V3;
            } 
            else if(V1 > V3){
                B = V3;
                C = V1;
            }

        }
        else if(V3 < V1 && V3 < V2){

            A = V3;

            if(V2 < V1){
                B = V2;
                C = V1;
            } 
            else if(V2 > V1){
                B = V1;
                C = V2;
            }

        }

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println("");
        System.out.println(V1);
        System.out.println(V2);
        System.out.println(V3);

        teclado.close();

    }

}