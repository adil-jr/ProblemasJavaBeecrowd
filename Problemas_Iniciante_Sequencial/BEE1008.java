import java.util.Scanner;
public class BEE1008 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int numero, trabalhoHora;
        double salarioHora, salario;
        // entrada
        numero = teclado.nextInt();
        trabalhoHora = teclado.nextInt();
        salarioHora = teclado.nextDouble();
        // processamento
        salario = trabalhoHora * salarioHora;
        // saída
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        teclado.close();
    }
}