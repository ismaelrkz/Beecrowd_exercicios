import java.util.Scanner;

public class BEE1052{

    public static void main(String args[]){

        int mesEntrada;
        String mesSaida;

        Scanner teclado = new Scanner(System.in);

        mesEntrada = teclado.nextInt();

        switch(mesEntrada){
            case 1:
                mesSaida = "January";
                break;
            case 2:
                mesSaida = "February";
                break;
            case 3:
                mesSaida = "March";
                break;
            case 4:
                mesSaida = "April";
                break;
            case 5:
                mesSaida = "May";
                break;
            case 6:
                mesSaida = "June";
                break;
            case 7:
                mesSaida = "July";
                break;
            case 8:
                mesSaida = "August";
                break;
            case 9:
                mesSaida = "September";
                break;
            case 10:
                mesSaida = "October";
                break;
            case 11:
                mesSaida = "November";
                break;
            case 12:
                mesSaida = "December";
                break;
            default:
                mesSaida = "Invalid month";
        }

        System.out.println(mesSaida);

        teclado.close();

    }

}