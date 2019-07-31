package com.br.uam.aula07;

import java.util.Scanner;

public class Problema06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, altura;
        
        System.out.println("Qual o raio do cilindro?");
        raio = entrada.nextDouble();
        System.out.println("Qual a altura do cilindro?");
        altura = entrada.nextDouble();
        
        double volume = 3.14159 * raio * raio * altura;
        System.out.println("O volume da lata de óleo é igual a " + volume + " cm3");
    }
}
