package com.br.uam.aula07;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        double valor,num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto:");
        valor = entrada.nextDouble();
        System.out.println("Valor a ser pago é de 2"
                + "R$" + (valor - (valor * 0.3)));
        
        num = 54;
    }
}
