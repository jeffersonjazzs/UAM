package com.br.uam.aula;
import java.util.Scanner;
public class Valor {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        double preço,descon;
        System.out.println("nome do produto");
        
        String produto,desconto;
        produto = entrada.nextLine();
        
        System.out.println("preço do produto");
        preço = entrada.nextDouble();
        System.out.println("tem desconto");
        desconto = entrada.nextLine();
  }
}
