import java.util.Scanner;

public class BEE1071 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorX, valorY, menor, maior, somaImpares = 0;

        valorX = teclado.nextInt();
        valorY = teclado.nextInt();

        menor = Math.min(valorX, valorY);
        maior = Math.max(valorX, valorY);

        for (int numero = menor + 1; numero < maior; numero++) {
            if (numero % 2 != 0) {
                somaImpares += numero;
            }
        }

        System.out.println(somaImpares);


        teclado.close();
    }
    
}
