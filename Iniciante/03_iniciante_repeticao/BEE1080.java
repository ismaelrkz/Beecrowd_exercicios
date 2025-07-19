import java.util.Scanner;

public class BEE1080 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int numero = keyboard.nextInt();

            if (numero > maior) {
                maior = numero;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        keyboard.close();
        
    }
}
