import java.util.Scanner;
public class BEE1005 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double a, pesoa = 3.5, b, pesob = 7.5, somapeso = 11, somamedia, media;
        // entrada
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        //processamento
        somamedia = (a * pesoa) + (b * pesob);
        media = somamedia / somapeso;
        // saída
        System.out.printf("MEDIA = %.5f\n", media);

        teclado.close();
    }
}