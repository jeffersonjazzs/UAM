package com.br.uam.aula;

import java.util.Scanner;

public class Detran {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano, preço, anoatual, diferenca;
        System.out.println("digite o ano do carro");
        ano = entrada.nextInt();
        System.out.println("digite o preço do carro");
        preço = entrada.nextInt();
        System.out.println("digite o ano atual");

        anoatual = entrada.nextInt();
        diferenca = anoatual - ano;

        if (diferenca < 10) {
            System.out.println((preço * 0.03) + "valor com 3% de imposto");
        } else {
            System.out.println((preço * 0.02) + "valor com 2% de imposto");
        }
    }
}
