
package com.br.uam.aula;

import java.util.Scanner;

public class Ordem {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("num1");
        num1 = ent.nextInt();
        System.out.println("num2");
        num2 = ent.nextInt();
        System.out.println("num3");
        num3 = ent.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("ordem crescente");
        }

    }
}
