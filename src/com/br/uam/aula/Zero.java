package com.br.uam.aula;

import java.util.Scanner;

public class Zero {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("digite o num maior que zero");
        double num = en.nextDouble();
        double quadrado, cubo, rquadrado, rcubica;
        quadrado = num * 2;
        cubo = num * 3;
        rquadrado = num * 1 / 2;
        rcubica = num * 1 / 3;
        System.out.println("quadrado" + quadrado);
        System.out.println("cubo" + cubo);
        System.out.println("raiz quadrada" + rquadrado);
        System.out.println("raiz cubica " + rcubica);

    }
}
