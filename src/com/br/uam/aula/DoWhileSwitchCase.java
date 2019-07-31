package com.br.uam.aula;

import java.util.Scanner;

public class DoWhileSwitchCase {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int primeiro, segundo, ope;
        System.out.println("digite o primeiro numero:");
        primeiro = ent.nextInt();
        System.out.println("digite o segundo numero:");
        segundo = ent.nextInt();

        do {
            System.out.println("digite a operação:");
            System.out.println("operação 1=soma 2=subtração 3=divisao 4=multiplicaçao 5=sair ");
            ope = ent.nextInt();

            switch (ope) {
                case 1:
                    System.out.println("soma:");
                    System.out.println(primeiro + segundo);
                    break;
                case 2:
                    System.out.println("subtração:");
                    System.out.println(primeiro - segundo);
                    break;
                case 3:
                    System.out.println("divisão:");
                    System.out.println(primeiro / segundo);
                    break;
                case 4:
                    System.out.println("multiplicação:");
                    System.out.println(primeiro * segundo);
                    break;
                case 5:
                    System.out.println("sair");
                    break;
            }
        } while (ope != 5);

    }
}
