package com.br.uam.aula07;

import java.util.Scanner;

public class Problema05 {
    public static void main(String[] args) {
        double salarioMinimo, kWConsumido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual é o valor do salário mínimo?");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Quantos quilowatts foram consumidos?");
        kWConsumido = entrada.nextDouble();
        
        System.out.println("1 kW custa R$" + (salarioMinimo/500));
        System.out.println("A residência terá que pagar R$" + ((salarioMinimo/500)*kWConsumido));
        System.out.println("Com desconto de 15%, a residência terá que pagar R$" + ((salarioMinimo/500)*kWConsumido*0.85));
    }
}
