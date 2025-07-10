import java.util.Scanner;

public class BEE1047{

    public static void main(String args[]){

        int horaInicial, minutoInicial, horaFinal, minutoFinal;
        int totalHoras, totalMinutos, totalInicialMinutos, totalFinalMinutos, intervalo;

        totalHoras = 0;
        totalMinutos = 0;
        intervalo = 0;

        Scanner teclado = new Scanner(System.in);


        horaInicial = teclado.nextInt();
        minutoInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        minutoFinal = teclado.nextInt();

        totalInicialMinutos = (horaInicial * 60) + minutoInicial;
        totalFinalMinutos = (horaFinal * 60) + minutoFinal;

        if (totalFinalMinutos <= totalInicialMinutos){

            totalFinalMinutos = totalFinalMinutos + (60 * 24);

        }

        intervalo = totalFinalMinutos - totalInicialMinutos;
        totalHoras = intervalo / 60;
        totalMinutos = intervalo % 60;

        System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");


        teclado.close();

    }

}