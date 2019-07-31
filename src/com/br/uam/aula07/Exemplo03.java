package com.br.uam.aula07;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        double n1, n2, n3, n4;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o 1º número");
        n1 = entrada.nextDouble();
        System.out.println("Digite o 2º número");
        n2 = entrada.nextDouble();
        System.out.println("Digite o 3º número");
        n3 = entrada.nextDouble();
        System.out.println("Digite o 4º número");
        n4 = entrada.nextDouble();
        
        double soma = n1 + n2 + n3 + n4;
        System.out.println("A soma dos números é " + soma);
    }
}
