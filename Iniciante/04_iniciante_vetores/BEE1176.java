import java.util.Scanner;

public class BEE1176 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int T = teclado.nextInt();

        long[] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // fib[valor do laço atual] = fib[valor do laço anterior] + fib[valor de dois laços atrás]
        }

        for (int i = 0; i < T; i++) {
            int N = teclado.nextInt();
            System.out.println("Fib(" + N + ") = " + fib[N]);
        }

        teclado.close();
    }
}
