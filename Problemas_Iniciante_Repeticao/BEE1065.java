import java.util.Scanner;

public class BEE1065 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int valor, pares = 0;

        for (int cont=1; cont <= 5; cont++){
            valor = teclado.nextInt();
            if (valor % 2 == 0) {
                pares++;
            }
        }

        System.out.printf("%d valores pares\n", pares);


        teclado.close();
    }
}