package com.br.uam.aula;

import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {

        //prova 4
        Scanner in = new Scanner(System.in);
        System.out.println("digite num");
        double num = in.nextDouble();
        System.out.println("ante" + (num - 1));
        System.out.println("suce" + (num + 1));
        //prova7 
        double valor;
        System.out.println("valor do pro");
        valor = in.nextDouble();
        double desconto;
        System.out.println("desconto");
        desconto = in.nextDouble();
        System.out.println("valor de deconto" + (valor - (valor * desconto / 100)));
        //questao 3
        int idade;
        double peso, altura, salario;
        boolean opcao;
        idade = 18;
        peso = 60.5;
        altura = 1.80;
        salario = 1000.00;
        opcao = true;

        System.out.println(idade > 18 && peso < 100.0);
        System.out.println(!(peso < 20) || altura > 1.30);
        System.out.println(salario > 500 && (salario <= 1000.0 || idade > 16));
        System.out.println(!opcao || salario != 500 && altura < 1.7);
        System.out.println(peso > 50.6 || idade > 18 && altura < 2.0);

    }
}
