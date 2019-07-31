package com.br.uam.aula;

/**
 *
 * @author jefferson
 */
public class Impressao {

    public static void main(String[] args) {

        int total = 0;
        for (int numer = 2; numer <= 14; numer += 2) {
            total += numer;
            System.out.println(total);
        }

    }
}
