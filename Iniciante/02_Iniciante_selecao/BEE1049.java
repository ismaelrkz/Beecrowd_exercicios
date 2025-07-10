import java.util.Scanner;

public class BEE1049{
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        
        String tipoAnimal = teclado.nextLine();
        String classeBiologica = teclado.nextLine();
        String alimentacao = teclado.nextLine();

        String tipoAnimalVertebrado = "vertebrado";
        String tipoAnimalInvertebrado = "invertebrado";

        String classeBiologicaAve = "ave";
        String classeBiologicaMamifero = "mamifero";
        String classeBiologicaInseto = "inseto";
        String classeBiologicaAnelideo = "anelideo";

        String alimentacaoCarnivoro = "carnivoro";
        String alimentacaoOnivoro = "onivoro";
        String alimentacaoHerbivoro = "herbivoro";
        String alimentacaoHematofago = "hematofago";

        String animal = "desconhecido";

        if(tipoAnimal.equals(tipoAnimalVertebrado)){

            if(classeBiologica.equals(classeBiologicaAve)){

                if(alimentacao.equals(alimentacaoCarnivoro)){

                    animal = "aguia";

                }
                else if(alimentacao.equals(alimentacaoOnivoro)){

                    animal = "pomba";

                }

            }
            else if(classeBiologica.equals(classeBiologicaMamifero)){

                if(alimentacao.equals(alimentacaoOnivoro)){

                    animal = "homem";

                }
                else if(alimentacao.equals(alimentacaoHerbivoro)){

                    animal = "vaca";

                }

            }

        }else if(tipoAnimal.equals(tipoAnimalInvertebrado)){

            if(classeBiologica.equals(classeBiologicaInseto)){

                if(alimentacao.equals(alimentacaoHematofago)){

                    animal = "pulga";

                }
                else if(alimentacao.equals(alimentacaoHerbivoro)){

                    animal = "lagarta";

                }

            }
            else if(classeBiologica.equals(classeBiologicaAnelideo)){

                if(alimentacao.equals(alimentacaoHematofago)){

                    animal = "sanguessuga";

                }
                else if(alimentacao.equals(alimentacaoOnivoro)){

                    animal = "minhoca";

                }

            }

        }

        System.out.println(animal);

        teclado.close();

    }

}