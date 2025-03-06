import java.util.Scanner;
public class BEE1007 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        // entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        // processamento
        DIFERENCA = (A * B) - (C * D);
        // saída
        System.out.println("DIFERENCA = " + DIFERENCA);


        teclado.close();
    }
}