package com.br.uam.aula07;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double tempSexta, tempSabado, tempDomingo;
        
        System.out.println("Temperatura máxima de sexta-feira:");
        tempSexta = entrada.nextDouble();
        System.out.println("Temperatura máxima de sábado:");
        tempSabado = entrada.nextDouble();
        System.out.println("Temperatura máxima de domingo:");
        tempDomingo = entrada.nextDouble();
        
        double media = (tempSexta + tempSabado + tempDomingo)/3;
        System.out.println("A média de temperatura do final de semana foi " + media);
    }
}
