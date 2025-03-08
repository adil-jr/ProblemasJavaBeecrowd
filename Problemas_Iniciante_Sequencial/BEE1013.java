import java.util.Scanner;
public class BEE1013 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, maiorAb, maior;
        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        // processamento
        maiorAb = (a + b + Math.abs(a - b)) / 2;
        maior = (maiorAb + c + Math.abs(maiorAb - c)) / 2;

        // saída
        System.out.println(maior + " eh o maior");

        teclado.close();
    }
}