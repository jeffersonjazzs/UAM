package com.br.uam.aula;

import java.util.Scanner;

public class Par {

    public static void main(String[] args) {
 
        Scanner entrada= new Scanner(System.in);
        System.out.println("informe o numero");
        
        int numero,resul;
        numero = entrada.nextInt();
        
        resul = numero%2;
        
        if (resul == 0){
            System.out.println(resul + "este numero é par");
        }else{ 
            System.out.println(resul + "este numero é impar");
        }
}
}
