package com.br.uam.aula;
import java.util.Scanner;

public class Sucessor {

    public static void main(String[] args) {
        // 1°prova aplicada.
        Scanner ent= new Scanner(System.in); 
        System.out.println("digite o num");
        int n = ent.nextInt();
        System.out.println("sucessor é" + (n + 1));
        System.out.println("ante é" + (n - 1 ));
    }
}
