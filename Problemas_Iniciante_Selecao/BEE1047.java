import java.util.Scanner;

public class BEE1047 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal;
        int minutosIniciais, minutosFinais;
        int duracaoTotalMinutos, duracaoHoras, duracaoMinutos;

        horaInicial = teclado.nextInt();
        minutoInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        minutoFinal = teclado.nextInt();

        minutosIniciais = horaInicial * 60 + minutoInicial;
        minutosFinais = horaFinal * 60 + minutoFinal;

        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            duracaoHoras = 24;
            duracaoMinutos = 0;
        } 
        else if (minutosFinais >= minutosIniciais) {
            duracaoTotalMinutos = minutosFinais - minutosIniciais;
            duracaoHoras = duracaoTotalMinutos / 60;
            duracaoMinutos = duracaoTotalMinutos % 60;
        } else {
            duracaoTotalMinutos = (24 * 60 - minutosIniciais) + minutosFinais;
            duracaoHoras = duracaoTotalMinutos / 60;
            duracaoMinutos = duracaoTotalMinutos % 60;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);




        teclado.close();
    }
}