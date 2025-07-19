import java.util.Scanner;

public class BEE1079{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        for(int i=1; i <=n; i++){

            double scoreOne = keyboard.nextDouble();
            double scoreTwo = keyboard.nextDouble();
            double scoreThree = keyboard.nextDouble();

            double gradePointAverage = ((scoreOne * 2) + (scoreTwo * 3) + (scoreThree * 5)) / 10;

            System.out.printf("%.1f\n" ,gradePointAverage);

        }

        keyboard.close();

    }

}