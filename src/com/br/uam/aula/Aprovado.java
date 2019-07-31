package com.br.uam.aula;

import java.util.Scanner;

public class Aprovado {

    public static void main(String[] args) {

        int media;

        System.out.println("Digite a média:");

        Scanner entrada = new Scanner(System.in);

        media = entrada.nextInt();

        if (media < 5) {
            System.out.println("Reprovado");
        } else if (media < 7.0) {
            System.out.println("Precisa estudar mais");
        } else {
            System.out.println("Aprovado");
        }
    }
}
