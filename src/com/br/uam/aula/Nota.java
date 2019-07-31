package com.br.uam.aula;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double matricula, frequencia, nota1, nota2, nota3, media;
        System.out.println("matricula");
        matricula = ent.nextDouble();
        System.out.println("frequencia");
        frequencia = ent.nextDouble();
        System.out.println("nota1");
        nota1 = ent.nextDouble();
        System.out.println("nota2");
        nota2 = ent.nextDouble();
        System.out.println("nota3");
        nota3 = ent.nextDouble();
        media = ((2 * nota1) + (3 * nota2) + (4 * nota3)) / 9;
        System.out.println("media final" + media);
        System.out.println("frequencia" + frequencia);
        if (media >= 7.0 && frequencia < 50) {
            System.out.println("final");
        } else if (media >= 7.0 && frequencia >= 50) {
            System.out.println("aprovado");
        } else if (5.0 <= media && media < 7.0 && frequencia < 50) {
            System.out.println("reprovado");
        } else if (5.0 <= media && media < 7.0 && frequencia >= 50) {
            System.out.println("final");
        } else if (media < 5.0) {
            System.out.println("final");
        } else if (media < 5.0) {
            System.out.println("reprovado");
        }

    }
}
