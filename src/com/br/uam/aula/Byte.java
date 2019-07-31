package com.br.uam.aula;

import java.util.Scanner;

public class Byte {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("entre com gigas");
        double bite;
        double giga = ent.nextDouble();
        bite = giga * 1024 * 1024 * 1024;
        System.out.println(bite + "bytes");
    }
}
