import java.util.Scanner;
public class BEE1051 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, imposto = 0.0;
        double valorExcedente;
        
        salario = teclado.nextDouble();
        
        if (salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario <= 3000.00) {
            valorExcedente = salario - 2000.00;
            imposto = valorExcedente * 0.08;
        } else if (salario <= 4500.00) {
            imposto = 1000.00 * 0.08; 
            valorExcedente = salario - 3000.00;
            imposto += valorExcedente * 0.18;
        } else {
            imposto = 1000.00 * 0.08; 
            imposto += 1500.00 * 0.18; 
            valorExcedente = salario - 4500.00;
            imposto += valorExcedente * 0.28;
        }
        
        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }
        
        teclado.close();
    }
}
