import java.util.Scanner;
public class BEE1016 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int distancia, minutos;
        // entrada
        distancia = teclado.nextInt();
        // processamento
        minutos = distancia * 2;
        // saída
        System.out.println(minutos + " minutos");


        teclado.close();
    }
}