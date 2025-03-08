import java.util.Scanner;
public class BEE1017 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int tempo, velocidade;
        double kmL = 12.0, calculo;
        // entrada
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
        // processamento
        calculo = (double) tempo * velocidade / kmL;
        // saída
        System.out.printf("%.3f\n", calculo);


        teclado.close();
    }
}