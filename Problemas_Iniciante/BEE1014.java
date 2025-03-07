import java.util.Scanner;
public class BEE1014 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a;
        double b, kmLitro;
        // entrada
        a = teclado.nextInt();
        b = teclado.nextDouble();
        // processamento
        kmLitro = (double) a / b;
        // saída
        System.out.printf("%.3f km/l\n", kmLitro);


        teclado.close();
    }
}