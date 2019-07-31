package com.br.uam.aula07;

import java.util.Scanner;

public class Problema08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso;
        
        System.out.println("Qual o peso da pessoa?");
        peso = entrada.nextDouble();
        
        System.out.println("O peso da pessoa em gramas é " + (peso *1000));
        System.out.println("Caso a pessoa engorde 12%, o peso dele será " + ((peso + (peso*12/100))*1000));
    
   }
}
