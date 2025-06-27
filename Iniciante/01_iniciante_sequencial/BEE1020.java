import java.util.Scanner;

public class BEE1020{

    public static void main(String args[]){
        
        int idadeDias, anos, meses, dias, restoDias;

        Scanner teclado = new Scanner(System.in);

        idadeDias = teclado.nextInt();

        anos = idadeDias / 365;
        meses = (idadeDias % 365) / 30;
        dias = (idadeDias % 365) % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        teclado.close();

    }

}