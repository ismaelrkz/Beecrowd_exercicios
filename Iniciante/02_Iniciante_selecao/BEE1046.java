import java.util.Scanner;

public class BEE1046{

    public static void main(String args[]){

        int horaInicio, horaFim, tempoTotal = 0;

        Scanner teclado = new Scanner(System.in);

        horaInicio = teclado.nextInt();
        horaFim = teclado.nextInt();

        if(horaInicio != horaFim){

            if(horaInicio < horaFim){

                tempoTotal = horaFim - horaInicio;

            }
            else if(horaFim < horaInicio){

                tempoTotal = (24 - horaInicio) + horaFim;

            }

        }
        else if(horaInicio == horaFim){

            tempoTotal = 24;
            
        }

        System.out.println("O JOGO DUROU " + tempoTotal + " HORA(S)");

        teclado.close();

    }

}