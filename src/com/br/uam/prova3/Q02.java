package com.br.uam.prova3;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as resistências:");
        double r1 = scanner.nextDouble(), r2 = scanner.nextDouble();
        while (r1 != 0 && r2 != 0) {
            double r = (r1 * r2) / (r1 + r2);
            System.out.println("Resistencia: " + r);
            System.out.println("Digite as resistências:");
            r1 = scanner.nextDouble();
            r2 = scanner.nextDouble();
        }
    }
}
