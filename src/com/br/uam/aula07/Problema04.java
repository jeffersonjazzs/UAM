package com.br.uam.aula07;

import java.util.Scanner;

public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoNascimento, anoAtual;
        
        System.out.println("Qual o ano de nascimento de João?");
        anoNascimento = entrada.nextInt();
        System.out.println("Qual o ano atual?");
        anoAtual = entrada.nextInt();
        
        System.out.println("João tem " + (anoAtual - anoNascimento) + " anos");
        System.out.println("Em 2016, João terá " + (2016 - anoNascimento) + " anos");
    }
}
