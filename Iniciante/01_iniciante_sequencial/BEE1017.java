import java.util.Scanner;

public class BEE1017{

    public static void main(String args[]){

        int tempoViagem, velocidadeMedia;
        
        double mediaConsumoCarro = 12.0; // km/l

        Scanner teclado = new Scanner(System.in);

        tempoViagem     = teclado.nextInt(); // hrs
        velocidadeMedia = teclado.nextInt(); // km/h

        double quantidadeLitros = (tempoViagem * velocidadeMedia) / mediaConsumoCarro;
        
        System.out.printf("%.3f\n", quantidadeLitros);

        teclado.close();

    }

}
