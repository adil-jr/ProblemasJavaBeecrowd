import java.util.Scanner;
public class BEE1011 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        double divisao = 4.0 / 3, pi = 3.14159, raio, potencia, volume;
        // entrada
        raio = teclado.nextDouble();
        //processamento
        potencia = raio * raio * raio;
        volume = divisao * pi * potencia;
        // saída
        System.out.printf("VOLUME = %.3f\n", volume);


        teclado.close();
    }
}