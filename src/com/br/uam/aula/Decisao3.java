package com.br.uam.aula;

import java.util.Scanner;

public class Decisao3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("operaçao ");
        String operando = in.next();
        int n1, n2;
        System.out.println("digite 1");
        n1 = in.nextInt();
        System.out.println("digi 2 ");
        n2 = in.nextInt();
        // este exercicio

        if (operando == "soma") {
            System.out.println("soma" + (n1 + n2));
        } else if (operando == "subtracao") {
            System.out.println("sub" + (n1 - n2));
        }

    }
}
