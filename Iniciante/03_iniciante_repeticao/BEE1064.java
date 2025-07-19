import java.util.Scanner;

public class BEE1064 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int numPositive = 0;
        double valuePositive = 0;

        for (int counter = 1; counter <= 6; counter++) {

            double value = keyboard.nextDouble();

            if (value > 0) {
                valuePositive += value;
                numPositive++;
            }

        }

        System.out.println(numPositive + " valores positivos");
        System.out.printf("%.1f\n", valuePositive / numPositive);

        keyboard.close();
    }
}
