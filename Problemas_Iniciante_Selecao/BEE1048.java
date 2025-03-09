import java.util.Scanner;

public class BEE1048 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        double salario, porcentualReajuste, valorReajuste, novoSalario;
        salario = teclado.nextDouble();

        if (salario <= 400.00){
            porcentualReajuste = 15;
        }
        else if (salario > 400.00 && salario <= 800.00){
            porcentualReajuste = 12;
        }
        else if (salario > 800.00 && salario <= 1200.00){
            porcentualReajuste = 10;
        }
        else if (salario > 1200.00 && salario <= 2000.00){
            porcentualReajuste = 7;
        } else {
            porcentualReajuste = 4;
        }

        valorReajuste = salario * (porcentualReajuste/100);
        novoSalario = salario + valorReajuste;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
        System.out.printf("Em percentual: %.0f %%\n", porcentualReajuste);


        teclado.close();
    }
}