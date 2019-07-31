package com.br.uam.aula;
import java.util.Scanner;
public class Potencia {

    public static void main(String[] args){
        
       // double potencia = Math.pow(5,3);
       //System.out.println(potencia);
        
        
        Scanner ent = new Scanner(System.in);
        double base  = ent.nextDouble();
        double potencia = Math.pow(base,3);
        System.out.println(potencia);
        
        
        
      //  System.out.println(Math.cos(90));
     //  double radiano = Math.toRadians(180);
      //  System.out.println(Math.cos(2));
        
        
    }
}
