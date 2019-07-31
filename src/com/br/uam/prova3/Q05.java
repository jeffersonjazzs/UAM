package com.br.uam.prova3;

import java.util.Scanner;
public class Q05 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaExcelente = 0, quantidadeExcelente = 0,
                quantidadeBom = 0, quantidadeRuimRegular = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a idade");
            int idade = scanner.nextInt();
            System.out.println("Digite a opiniao");
            String opiniao = scanner.next();
            if (opiniao.equals("excelente")) {
                somaExcelente += idade;
                quantidadeExcelente++;
            } else if (opiniao.equals("bom")) {
                quantidadeBom++;
            } else {
                quantidadeRuimRegular++;
            }
        }
        System.out.println("Media idade excelente: " + (somaExcelente/quantidadeExcelente));
        System.out.println("Percentagem bom: " + (quantidadeBom/50*100));
        System.out.println("Quantidade ruim ou regular: " + quantidadeRuimRegular);
    }
}
