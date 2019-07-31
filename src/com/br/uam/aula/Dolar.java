/** Faça um algoritmo que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui.
 * Essa pessoa vai passar por vários países e precisa converter seu dinheiro em dólares,
 * marco alemão e libra esterlina. Sabe-se que a cotação do dólar é de R$ 1,80, do marco alemão é de R$ 2,00 e
 * da libra esterlina é de R$ 1,57. O algoritmo deve fazer as conversões e mostrá-las.
 */
package com.br.uam.aula;

import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        double real, dolar, marco, libra;
        System.out.println("entre com reais");
        real = en.nextDouble();
        System.out.println("entre com dolar");
        dolar = en.nextDouble();
        System.out.println("entre com marco");
        marco = en.nextDouble();
        System.out.println("entre comm libra");
        libra = en.nextDouble();
        System.out.println();
    }
}
