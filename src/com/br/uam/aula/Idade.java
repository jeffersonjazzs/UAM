package com.br.uam.aula;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe sua idade");
        int idade;
        idade = entrada.nextInt();

        if (idade < 18) {
            System.out.println("menor de idade");
        } else {
            System.out.println("maior de idade");
        }
        if (idade > 65) {
            System.out.println("maior de 65 anos");
        }
        if (idade <= 0) {
            System.out.println("idade informada é invalida");
        }

    }
}
