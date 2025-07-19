import java.util.Scanner;

public class BEE1061{

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        // --- Entrada --- //

        String[] entradaDiaInicio = keyboard.nextLine().split(" ");
        int diaInicio = Integer.parseInt(entradaDiaInicio[1]);

        String[] entradaHorarioInicio = keyboard.nextLine().split(":");
        int horaInicio = Integer.parseInt(entradaHorarioInicio[0].trim());
        int minutoInicio = Integer.parseInt(entradaHorarioInicio[1].trim());
        int segundoInicio = Integer.parseInt(entradaHorarioInicio[2].trim());


        String[] entradaDiaFim = keyboard.nextLine().split(" ");
        int diaFim = Integer.parseInt(entradaDiaFim[1]);

        String[] entradaHorarioFim = keyboard.nextLine().split(":");
        int horaFim = Integer.parseInt(entradaHorarioFim[0].trim());
        int minutoFim = Integer.parseInt(entradaHorarioFim[1].trim());
        int segundoFim = Integer.parseInt(entradaHorarioFim[2].trim());

        // --- Processamento --- //

        // Conversão do início e fim para segundos absolutos
        int inicioSegundos = segundoInicio + (minutoInicio * 60) + (horaInicio * 3600) + (diaInicio * 86400);
        int fimSegundos = segundoFim + (minutoFim * 60) + (horaFim * 3600) + (diaFim * 86400);
        
        int duracaoSegundos = fimSegundos - inicioSegundos;

        // Cálculo de dias, horas, minutos e segundos
        int dias = duracaoSegundos / 86400;
        duracaoSegundos %= 86400;

        int horas = duracaoSegundos / 3600;
        duracaoSegundos %= 3600;

        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        
        // --- Saída --- //

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        
        keyboard.close();

    }

}