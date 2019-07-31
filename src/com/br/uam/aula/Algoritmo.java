package com.br.uam.aula;

import java.util.Scanner;

public class Algoritmo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiro, segundo;
        char a, e, i, o, u;
        System.out.println("digite o primeiro numero");
        primeiro = entrada.nextInt();
        System.out.println("digite o segundo numero");
        segundo = entrada.nextInt();

        System.out.println("escolha sua operação + - * / ");
        a = entrada.next().charAt(0);

    }
}
