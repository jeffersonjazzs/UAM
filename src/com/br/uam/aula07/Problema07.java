package com.br.uam.aula07;

import java.util.Scanner;

public class Problema07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorHora, quantAula, percentINSS;
        
        System.out.println("Qual o valor da hora aula?");
        valorHora = entrada.nextDouble();
        System.out.println("Qual a quantidade de horas?");
        quantAula = entrada.nextDouble();
        System.out.println("Qual o percentual do desconto do INSS?");
        percentINSS = entrada.nextDouble();
        
        double salarioBruto = valorHora * quantAula;
        double salarioLiquido = salarioBruto - (salarioBruto*percentINSS/100);
        System.out.println("O salário líquido do professor é R$" + salarioLiquido);
    }
}
