import java.util.Scanner;

public class BEE1040{

    public static void main(String args[]){

        double N1, N2, N3, N4, notaExame, media, mediaFinal; //pesos: 2 3 4 e 1

        Scanner teclado = new Scanner(System.in);

        N1 = teclado.nextDouble();
        N2 = teclado.nextDouble();
        N3 = teclado.nextDouble();
        N4 = teclado.nextDouble();


        media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        media = Math.floor(media * 10) / 10.0;

        if(media >= 7.0){
            
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");

        } 
        else if(media < 5.0){ 
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado."); 

        } 
        else if(media >= 5.0 && media <= 6.9){
            
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");

            notaExame = teclado.nextDouble();

            System.out.printf("Nota do exame: %.1f\n", notaExame);

            mediaFinal = (media + notaExame) / 2;
            mediaFinal = Math.floor(mediaFinal * 10) / 10.0;

            if(mediaFinal >= 5.0){

                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);

            } 
            else if(mediaFinal <= 4.9){

                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);

            }

        }

        teclado.close();

    }

}