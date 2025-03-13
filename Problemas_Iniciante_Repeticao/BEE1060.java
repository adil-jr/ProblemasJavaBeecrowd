import java.util.Scanner;
public class BEE1060 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);

        float valor;
        int numPos = 0;

        for (int cont = 1; cont <= 6; cont++) {
            valor = teclado.nextFloat();
            if (valor > 0){
                numPos++;
            }
        }
        System.out.println(numPos + " valores positivos");

        teclado.close();
    }
}