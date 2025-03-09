import java.util.Scanner;

public class BEE1046 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        horaInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();

        if (horaFinal > horaInicial){
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else if (horaFinal <= horaInicial){
            duracao = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else if (horaInicial == horaFinal){
            duracao = 24;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }


        teclado.close();
    }
}