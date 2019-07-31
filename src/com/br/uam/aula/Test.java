package com.br.uam.aula;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("sexo");
        String sexo = ent.nextLine();
        /*  if (sexo.equals("m")){
            System.out.println(72.7*-58);
        }  else if (sexo.equals("f")){
                System.out.println(62.1*-14.7);
            }else {
                System.out.println("indeter");
            } */
        char s = ent.next().charAt(0);
        switch (s) {
            case 'm':
                System.out.println("72");
                break;
            case 'f':
                System.out.println("62");
                break;
            default:
                System.out.println("inder");
                break;
        }

    }
}
