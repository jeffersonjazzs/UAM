package com.br.uam.aula;
import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
    int primeiro,segundo,ope;
    char operaçao;
        System.out.println("digite o primeiro numero");
    primeiro = ent.nextInt();
        System.out.println("digite o segundo numero");
    segundo = ent.nextInt();
        System.out.println("escolha sua operação + - * / ");
    operaçao = ent.next().charAt(0);
        switch(operaçao){
        case '+':
            System.out.println("soma");  
            System.out.println(primeiro+segundo);
        break;
        case '-':
            System.out.println("subtração");
             System.out.println(primeiro-segundo);
        break;        
        case '*':
            System.out.println("divisão");
            System.out.println(primeiro/segundo);
        break;
        case '/':
            System.out.println("multiplicação");
            System.out.println(primeiro*segundo);
        break;
        case '%':
            System.out.println("resto");
            System.out.println(primeiro%segundo);
        break;
        default :
            System.out.println("opção invalida");
        break;
       }    
}
}
              
    

