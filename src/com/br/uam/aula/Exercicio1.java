package com.br.uam.aula;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n1, n2, adicao;
        System.out.println("numero 1");
        n1 = ent.nextInt();
        System.out.println("numero 2");
        n2 = ent.nextInt();
        adicao = n1 + n2;
        if (adicao > 20) {
            System.out.println("valor" + (adicao + 8));
        } else {
            System.out.println("valor" + (adicao - 5));
        }

    }
}
