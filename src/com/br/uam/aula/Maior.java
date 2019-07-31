package com.br.uam.aula;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("1°°");
        n1 = ent.nextInt();
        System.out.println("2°°");
        n2 = ent.nextInt();
        System.out.println("3°°");
        n3 = ent.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
        } else if (n2 > n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

    }
}
