package com.br.uam.aula;

import java.util.Scanner;

public class Massa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double massa_inicial = 0;
        double massa_atual = 0;
        int tempo = 0;
        int hora, minuto, segundo;
        System.out.println("massa inicial");
        massa_inicial = entrada.nextDouble();

        while (massa_inicial >= 0.5) {
            tempo = tempo + 50;
            massa_atual = massa_atual / 2.0;
        }
        //transforma os segundos
        hora = tempo / 3600;
        minuto = (tempo - hora * 3600) / 60;
        segundo = (tempo - minuto * 60 - hora * 3600);

        System.out.println("tempo em seg" + tempo);
        System.out.println("horas " + hora);
        System.out.println("minutos" + minuto);
        System.out.println("segundos" + segundo);
        System.out.println("massa em gramas" + massa_atual);

    }
}
