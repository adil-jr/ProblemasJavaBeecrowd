import java.util.Scanner;
public class BEE1009 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        String nome;
        double salario, venda, total;
        // entrada
        nome = teclado.nextLine();
        salario = Double.parseDouble(teclado.nextLine());
        venda = Double.parseDouble(teclado.nextLine());
        // processamento
        total = (venda * 0.15) + salario;
        // saída
        System.out.printf("TOTAL = R$ %.2f\n", total);


        teclado.close();
    }
}