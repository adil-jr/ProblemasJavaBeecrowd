import java.util.Scanner;

public class BEE1049 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        String tipoPrincipal, subcategoria, alimentacao;
        String animalIdentificado = "";

        tipoPrincipal = teclado.nextLine();
        subcategoria = teclado.nextLine();
        alimentacao = teclado.nextLine();

        if (tipoPrincipal.equals("vertebrado")) {
            if (subcategoria.equals("ave")) {
                if (alimentacao.equals("carnivoro")) {
                    animalIdentificado = "aguia";
                } else if (alimentacao.equals("onivoro")) {
                    animalIdentificado = "pomba";
                }
            } else if (subcategoria.equals("mamifero")) {
                if (alimentacao.equals("onivoro")) {
                    animalIdentificado = "homem";
                } else if (alimentacao.equals("herbivoro")) {
                    animalIdentificado = "vaca";
                }
            }
        } else if (tipoPrincipal.equals("invertebrado")) {
            if (subcategoria.equals("inseto")) {
                if (alimentacao.equals("hematofago")) {
                    animalIdentificado = "pulga";
                } else if (alimentacao.equals("herbivoro")) {
                    animalIdentificado = "lagarta";
                }
            } else if (subcategoria.equals("anelideo")) {
                if (alimentacao.equals("hematofago")) {
                    animalIdentificado = "sanguessuga";
                } else if (alimentacao.equals("onivoro")) {
                    animalIdentificado = "minhoca";
                }
            }
        }

        System.out.println(animalIdentificado);



        teclado.close();
    }
}