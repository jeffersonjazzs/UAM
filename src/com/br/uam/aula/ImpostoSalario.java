
package com.br.uam.aula;

import java.util.Scanner;

public class ImpostoSalario {

    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    double salario;
    System.out.println("digite seu dinheiro");
    salario = entrada.nextDouble();
   
    if (salario <= 600)  {
        System.out.println(salario + "insento");
        }else {
        System.out.println(salario + "com desconto de 30");
            }
    if (salario > 1200) {
            System.out.println(salario + "com desconto de 40");
            }
}
}