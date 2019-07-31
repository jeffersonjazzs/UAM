package com.br.uam.aula;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int opcao;
        opcao = ent.nextInt();
        System.out.println("saque,deposito,extrato,saida");

        switch (opcao) {
            case 1:
                System.out.println("saque");
                break;
            case 2:
                System.out.println("depo");
                break;
            case 3:
                System.out.println("extq");
                break;
        }
        System.out.println("saindo");
    }

}
