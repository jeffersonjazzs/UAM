package com.br.uam.aula;
import java.util.Scanner;
public class While {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
     int contador = 0;
        System.out.println("digte a quantidade de vezes");
    int quantidade = in.nextInt();
        
        while (contador < quantidade) {
    
        System.out.println("numeros");
     int numero1 = in.nextInt(),numero2 = in.nextInt();
        System.out.println("soma "+ (numero1 + numero2));
    contador++;
            System.out.println(contador);
        }
}
}
