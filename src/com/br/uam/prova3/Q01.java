package com.br.uam.prova3;


import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaPar = 0;
        int quantNegativo = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número");
            double n = scanner.nextDouble();
            if (n % 2 == 0) {
                somaPar += n;
            }
            if (n < 0) {
                quantNegativo++;
            }
        }
        System.out.println("Soma par: " + somaPar);
        System.out.println("Quantidade de negativos: " + quantNegativo);;
        System.out.println();
    }
}
