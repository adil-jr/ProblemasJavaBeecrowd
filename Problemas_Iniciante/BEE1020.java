import java.util.Scanner;
public class BEE1020 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a, ano, mes, dia, resto;
        // entrada
        a = teclado.nextInt();
        // processamento
        ano = a / 365;
        resto = a % 365;

        mes = resto / 30;
        resto = resto % 30;

        dia = resto;
        // saída
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");


        teclado.close();
    }
}