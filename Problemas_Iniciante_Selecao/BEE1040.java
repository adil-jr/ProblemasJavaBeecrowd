import java.util.Scanner;

public class BEE1040 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        double a, b, c, d, mInicial, nExame, mFinal;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        d = teclado.nextDouble();

        mInicial = (a * 2) + (b * 3) + (c * 4) + (d * 1);
        mInicial = mInicial / 10;

        mInicial = Math.floor(mInicial * 10) / 10;

        System.out.printf("Media: %.1f\n", mInicial);

        if (mInicial >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        else if (mInicial < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else if (mInicial >= 5.0 && mInicial <= 6.9){
            System.out.println("Aluno em exame.");
        

        nExame = teclado.nextDouble();

        System.out.printf("Nota do exame: %.1f\n", nExame);

        mFinal = (mInicial + nExame) / 2;

        if (mFinal >= 5.0){
            System.out.println("Aluno aprovado.");
        }
        else {
            System.out.println("Aluno reprovado.");
        }

        System.out.printf("Media final: %.1f\n", mFinal);
        }

        teclado.close();
    }
}