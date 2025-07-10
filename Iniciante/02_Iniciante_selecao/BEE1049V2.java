import java.util.Scanner;

public class BEE1049 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String tipoAnimal = teclado.nextLine();
        String classeBiologica = teclado.nextLine();
        String alimentacao = teclado.nextLine();

        String animal = "desconhecido";

        switch (tipoAnimal) {
            case "vertebrado":
                switch (classeBiologica) {
                    case "ave":
                        switch (alimentacao) {
                            case "carnivoro":
                                animal = "aguia";
                                break;
                            case "onivoro":
                                animal = "pomba";
                                break;
                        }
                        break;

                    case "mamifero":
                        switch (alimentacao) {
                            case "onivoro":
                                animal = "homem";
                                break;
                            case "herbivoro":
                                animal = "vaca";
                                break;
                        }
                        break;
                }
                break;

            case "invertebrado":
                switch (classeBiologica) {
                    case "inseto":
                        switch (alimentacao) {
                            case "hematofago":
                                animal = "pulga";
                                break;
                            case "herbivoro":
                                animal = "lagarta";
                                break;
                        }
                        break;

                    case "anelideo":
                        switch (alimentacao) {
                            case "hematofago":
                                animal = "sanguessuga";
                                break;
                            case "onivoro":
                                animal = "minhoca";
                                break;
                        }
                        break;
                }
                break;
        }

        System.out.println(animal);

        teclado.close();
    }
}
