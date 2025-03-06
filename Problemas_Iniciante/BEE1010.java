import java.util.Scanner;
public class BEE1010 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int codigo1, quantidade1, codigo2, quantidade2;
        double valor1, valor2, soma1, soma2, total;
        // entrada
        codigo1 = teclado.nextInt();
        quantidade1 = teclado.nextInt();
        valor1 = teclado.nextDouble();
        codigo2 = teclado.nextInt();
        quantidade2 = teclado.nextInt();
        valor2 = teclado.nextDouble();
        // processamento
        soma1 = quantidade1 * valor1;
        soma2 = quantidade2 * valor2;
        total = soma1 + soma2;
        // saída
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);


        teclado.close();
    }
}