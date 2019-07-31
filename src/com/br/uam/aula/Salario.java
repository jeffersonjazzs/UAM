package com.br.uam.aula;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite o salario");
        int sa = ent.nextInt();
        int num1 = 600, num2 = 1200, num3 = 2000;

        if (sa <= num1) {
            System.out.println("insento");
        } else if (sa > num1 && sa < num2) {
            System.out.println("com desconto de 20");
        } else if (sa > num2 && sa < num3) {
            System.out.println("com desconto de 25");

        } else if (sa > num3) {
            System.out.println("com descoto de 30");
        }
    }
}
