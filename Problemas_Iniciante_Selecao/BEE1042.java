import java.util.Scanner;
public class BEE1042 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int a, b, c, maior, intermediario, menor;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if (a <= b && a <= c){
            menor = a;
        }
        else if (b <= a && b <= c){
            menor = b;
        } else {
            menor = c;
        }


        if (a >= b && a >= c){
            maior = a;
        }
        else if (b >= a && b >= c){
            maior = b;
        } else {
            maior = c;
        }

        if (a != menor && a != maior){
            intermediario = a;
        }
        else if (b != menor && b != maior){
            intermediario = b;
        } else {
            intermediario = c;
        }

        System.out.println(menor);
        System.out.println(intermediario);
        System.out.println(maior);

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        teclado.close();
    }
}