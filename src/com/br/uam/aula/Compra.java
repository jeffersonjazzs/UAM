package com.br.uam.aula;

import java.util.Scanner;

public class Compra {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("produto A");
        int valor;
        System.out.println("valor:");
        valor = ent.nextInt();

        if (valor < 20) {
            System.out.println("Valor da venda com 45% "
                    + "R$" + (valor + (valor * 0.45)));

        } else {
            System.out.println("Valor da venda com 30% "
                    + "R$" + (valor + (valor * 0.30)));
        }
    }
}
