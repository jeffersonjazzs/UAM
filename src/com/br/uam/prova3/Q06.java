package com.br.uam.prova3;

import java.util.Scanner;
public class Q06 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorAltura = 0;
        int menorIdade = 200;
        for (int i = 1; i <= 30; i++) {
            double alturaMedia = 0, idadeMedia = 0;
            for (int j = 1; j <= 12; j++) {
                System.out.println("Digite a altura");
                double altura = scanner.nextDouble();
                System.out.println("Digite a idade");
                int idade = scanner.nextInt();
                alturaMedia += altura;
                idadeMedia += idade;
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }
            }
            System.out.println("Altura media do time " + i + ": " + (alturaMedia/12));
            System.out.println("Idade media do time " + i + ": " + (idadeMedia/12));
        }
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor idade: " + menorIdade);
    }
}
