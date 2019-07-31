package com.br.uam.aula;
import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int idade,peso;
        System.out.println("digite idade ");
        idade = ent.nextInt();
        System.out.println("digite peso");
        peso = ent.nextInt();
              
        if (idade < 20 && peso <60){
            System.out.println("9");
          }else if (idade < 20 && 60 > peso && peso < 90){
              System.out.println("8");
          }else if (idade < 20 && peso >90){
            System.out.println("7");    
          }else if (20 > idade && idade < 50 && peso <60){
              System.out.println("6");
          }else if (20 > idade && idade < 50 && 60 > peso && peso < 90){
              System.out.println("5");
           }else if (20 > idade && idade <50 && peso > 90){
               System.out.println("4");
               
               
               
           }else if (idade > 50 && peso <60){
               System.out.println("3");
           }else if (idade > 50 && 60 > peso && peso < 90){
               System.out.println("2");
           }else if (idade > 50 && peso > 90){
               System.out.println("1");
           }
}
}
