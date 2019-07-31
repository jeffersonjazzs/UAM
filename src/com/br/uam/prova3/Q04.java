package com.br.uam.prova3;


import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = scanner.nextInt();
        int i;
        for (i = n; i <= 500; i=i*3) {
            System.out.print(i + " ");
        }
        System.out.print(i);
        System.out.println();
    }
}
