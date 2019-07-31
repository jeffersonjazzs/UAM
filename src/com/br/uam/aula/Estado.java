package com.br.uam.aula;

import java.util.Scanner;

public class Estado {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        /*   System.out.println("estado");
        String estado = ent.nextLine();
        if(estado.equals("ba")){
            System.out.println("baiano");
        }else if (estado.equals("rj")){
            System.out.println("ca");
        }else if (estado.equals("mg")){
            System.out.println("mineiro");
        }else if (estado.equals("sp")){
            System.out.println("paulista");
        }else {
            System.out.println("outro");
        }
         */

        System.out.println("estado");
        int esta = ent.nextInt();
        System.out.println("operação 1=baiano " + "operação 2=carioca " + "operação 3=min " + "operaçao 4=paulista " + "operção 5=sair ");
        switch (esta) {
            case 1:
                System.out.println("baiano");
                break;
            case 2:
                System.out.println("rs");
                break;
            case 3:
                System.out.println("mineiro");
                break;
            case 4:
                System.out.println("paulista");
                break;
            default:
                System.out.println("outro");
        }

    }
}
