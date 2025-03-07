import java.util.Scanner;
public class BEE1015 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, diferenca, diferenca2, quadrado, quadrado2, somaResultado, calcRaiz;
        // entrada
        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();
        // processamento
        diferenca = x2 - x1;
        diferenca2 = y2 - y1;
        quadrado = diferenca * diferenca;
        quadrado2 = diferenca2 * diferenca2;
        somaResultado = quadrado + quadrado2;
        calcRaiz = Math.sqrt(somaResultado);
        // saída
        System.out.printf("%.4f\n", calcRaiz);



        teclado.close();
    }
}