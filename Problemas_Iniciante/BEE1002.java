import java.util.Scanner;
public class BEE1002{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double area, n = 3.14159, raio, potencia;
        // entrada
        raio = teclado.nextDouble();
        // processamento
        potencia = raio * raio;
        area = n * potencia;
        // saída
        System.out.printf("A=%.4f\n", area);



        teclado.close();
    }
}