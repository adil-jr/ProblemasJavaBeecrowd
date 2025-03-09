import java.util.Scanner;

public class BEE1045 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double a, b, c, valorTemporario;
        double a2, b2, c2;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if (a < b){
            valorTemporario = a;
            a = b;
            b = valorTemporario;
        }
        
        if (a < c){
            valorTemporario = a;
            a = c;
            c = valorTemporario;
        }

        if (b < c){
            valorTemporario = b;
            b = c;
            c = valorTemporario;
        }

        if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        a2 = a * a;
        b2 = b * b;
        c2 = c * c;

        if (a2 == b2 + c2){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (a2 > b2 + c2){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if (a2 < b2 + c2){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if (a == b || b == c || a ==c){
            System.out.println("TRIANGULO ISOSCELES");
        }


        teclado.close();
    }
}