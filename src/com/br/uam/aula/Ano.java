package com.br.uam.aula;

import java.util.Scanner;

public class Ano {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int anon,anoa;
        System.out.println("digite ano de nasc");
        anon  = en.nextInt();
        System.out.println("digite o ano tual");
        anoa = en.nextInt();
        System.out.println("idade " + (anoa-anon));
        System.out.println("idade em 2016 " + (2017-anon) + "anos");
        
        
    }
}
