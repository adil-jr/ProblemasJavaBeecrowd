import java.util.Scanner;
public class BEE1019 {
    public static void main (String agrs[]) {
        Scanner teclado = new Scanner(System.in);
        int n, hora, minuto, segundo, resto;
        // entrada
        n = teclado.nextInt();
        // processamento
        hora = n / 3600;
        resto = n % 3600;

        minuto = resto / 60;
        resto = resto % 60;

        segundo = resto;
        // saída
        System.out.printf("%d:%d:%d\n", hora, minuto, segundo);


        teclado.close();
    }
}