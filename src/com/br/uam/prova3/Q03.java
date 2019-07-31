package com.br.uam.prova3;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("Digite o sexo");
            char sexo = scanner.next().charAt(0);
            System.out.println("Digite a idade");
            int idade = scanner.nextInt();
            System.out.println("Formacao escolar - 1 / 2 / 3");
            int escolaridade = scanner.nextInt();
            if (sexo == 'f' && idade <= 25 && escolaridade == 2) {
                System.out.println("Recepcionista");
            } else if (sexo == 'm' && idade >40 && escolaridade == 1) {
                System.out.println("Servente");
            } else if (idade < 30 && escolaridade == 3) {
                System.out.println("Auxiliar de RH");
            } else {
                System.out.println("Nao ha cargo disponivel");
            }
            System.out.println("Deseja continuar?");
            opcao = scanner.next();
        } while (opcao.equals("nao"));
    }
}
