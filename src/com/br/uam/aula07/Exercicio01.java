package com.br.uam.aula07;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        //declaracao de variaveis
        String nome;
        int idade;
        double salario;
        float altura;
        char opcao;
        boolean resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = entrada.next();
        System.out.println("Nome Lido: " + nome);
        
        System.out.println("Digite sua idade");
        idade = entrada.nextInt();
        System.out.println("Idade Lida: " + idade);
        
        System.out.println("Digite seu salário");
        salario = entrada.nextDouble();
        System.out.println("Salário Lido: " + salario);
        
        System.out.println("Digite sua altura");
        altura = entrada.nextFloat();
        System.out.println("Altura Lida: " + altura);
        
        System.out.println("Digite sua opção");
        opcao = entrada.next().charAt(0);
        System.out.println("Opção Lida: " + opcao);
        
        System.out.println("Digite seu resultado");
        resultado = entrada.nextBoolean();
        System.out.println("Resultado Lido: " + resultado);
    }
}
