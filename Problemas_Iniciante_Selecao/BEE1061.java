import java.util.Scanner;

public class BEE1061 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);
        int diaInicio, diaFim;
        int horaInicio, minInicio, segInicio;
        int horaFim, minFim, segFim;
        int duracaoDias, duracaoHoras, duracaoMinutos, duracaoSegundos;

        String entrada = teclado.nextLine();
        diaInicio = Integer.parseInt(entrada.substring(entrada.indexOf(" ") + 1));

        entrada = teclado.nextLine();
        String[] tempoInicio = entrada.split(" : ");
        horaInicio = Integer.parseInt(tempoInicio[0]);
        minInicio = Integer.parseInt(tempoInicio[1]);
        segInicio = Integer.parseInt(tempoInicio[2]);

        entrada = teclado.nextLine();
        diaFim = Integer.parseInt(entrada.substring(entrada.indexOf(" ") + 1));

        entrada = teclado.nextLine();
        String[] tempoFim = entrada.split(" : ");
        horaFim = Integer.parseInt(tempoFim[0]);
        minFim = Integer.parseInt(tempoFim[1]);
        segFim = Integer.parseInt(tempoFim[2]);

        int inicioEmSegundos = segInicio + minInicio * 60 + horaInicio * 3600 + diaInicio * 86400;
        int fimEmSegundos = segFim + minFim * 60 + horaFim * 3600 + diaFim * 86400;

        int duracaoTotal = fimEmSegundos - inicioEmSegundos;

        duracaoDias = duracaoTotal / 86400;
        duracaoTotal %= 86400;
        duracaoHoras = duracaoTotal / 3600;
        duracaoTotal %= 3600;
        duracaoMinutos = duracaoTotal / 60;
        duracaoSegundos = duracaoTotal % 60;

        System.out.println(duracaoDias + " dia(s)");
        System.out.println(duracaoHoras + " hora(s)");
        System.out.println(duracaoMinutos + " minuto(s)");
        System.out.println(duracaoSegundos + " segundo(s)");


        teclado.close();
    }
}