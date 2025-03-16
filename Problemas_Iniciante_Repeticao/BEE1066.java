import java.util.Scanner;

public class BEE1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, par = 0, impar = 0, pos = 0, neg =0;

        for (int cont = 1; cont <= 5; cont++){
            valor = teclado.nextInt();
            if (valor % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (valor > 0) {
                pos++;
            } else if (valor < 0) {
                neg++;
            }
        }
        
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);


        teclado.close();
    }
}
