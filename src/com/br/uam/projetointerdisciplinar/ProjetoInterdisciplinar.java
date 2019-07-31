package com.br.uam.projetointerdisciplinar;

import java.util.Scanner;

public class ProjetoInterdisciplinar {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in); //inicializaçao do Scanner
        double velI, angulo = 0, altMax, tempo, acel, alcanceh, alvo, dist;
        /*essas variaveis serao utilizadas para os calculos aritmeticos do
         programa
         atribuimos um valor inicial para o angulo pois em um determinado trecho
         do programa é declarado o angulo dentro do escopo do if ou do else
         então não foi possivel mais utiliza-lo depois desse trecho, porem, 
         é obrigatorio que o usuario digite um valor para o angulo porque ele
         tera que passar pelo trecho onde sera atribuido o valor a essa variavel
         utilizei "do{}while();" para isso, e o proprio "if(){}else{" ja impede
         que nao seja digitado nenhum valor a essa variavel*/
        String ang, reset;
        /*essas duas Strings sao para decisao de como sera digitado o angulo 
         e se o usuario deseja recomeçar o programa ao termino dele*/
        do {
            do {
                System.out.println("Digite um valor positivo para a velocidade inicial:");
                velI = ent.nextDouble();
            } while (velI <= 0);
            do {
                System.out.println("Digite um valor positivo para a aceleração:");
                acel = ent.nextDouble();
            } while (acel <= 0);
            do {
                System.out.println("Voce deseja digitar o angulo em radianos ou em graus?\ngraus\nradianos");
                ang = ent.next();
                if (ang.equalsIgnoreCase("radianos")) {
                    do {
                        System.out.println("Digite o angulo em radianos entre 0 e PI/2(=~ 1,57079) que não seja os mesmos:");
                        angulo = ent.nextDouble();
                    } while (0 >= angulo || angulo >= Math.toRadians(90));
                    /*aqui eu coloquei essa condição com "Math.toRadians()" pois,
                     o usuario vai digitar o que representaria 90 graus em radianos
                     que seria PI/2 ou aproximadamente 1.570796327*/
                } else if (ang.equalsIgnoreCase("graus")) {
                    do {
                        System.out.println("Digite o angulo em graus entre 0 e 90 que não seja os mesmos:");
                        angulo = Math.toRadians(ent.nextDouble());
                        /*transformei para radianos aqui para não repetir os calculos
                         aritmeticos la em baixo*/
                    } while (0 >= angulo || angulo >= Math.toRadians(90));
                    /*aqui tem que ser "Math.toRadians()" tambem pois a
                     transformação acontece antes do "while()"*/
                }
                /*o exercicio pede para que todas as variaveis do tipo double recebam valores positivos e que os
                 angulos alem de serem positivos não podem ser retos nem maiores que isso, ou seja,
                 em graus não pode ultrapassar 90º e, em radianos não pode ultrapassar PI/2
                 que seria a mesma coisa que aproximadamente 1.5707963267948966 ou "Math.toRadians(90)".
                 Para isso usetilizei "do{}while();" para repetir cada 
                 trecho onde o usuario digite um valor que não atende às condições
                 desejadas do exercicio*/
            } while (!(ang.equalsIgnoreCase("radianos") || ang.equalsIgnoreCase("graus")));
            /*caso o usuario digite algo diferente de graus e radianos 
             a linha de codigo acima sera reexecutada, decidimos ser 
             rigorosos nisso, pois o usuario poderia digitar por exemplo
             "x", e, em nossa linguagem isso não significaria nem graus
             nem radianos, e então eu gostariamos que o usuario digitasse
             algo valido*/
            altMax = ((Math.pow(velI, 2)) * (Math.pow(Math.sin(angulo), 2))) / (2 * acel);
            tempo = (2 * velI * Math.sin(angulo)) / acel;
            alcanceh = 2 * Math.pow(velI, 2) * ((Math.cos(angulo) * Math.sin(angulo)) / acel);
            do {
                System.out.println("Digite o tamanho do alvo entre 5 e 10 inclusive:");
                alvo = ent.nextDouble();
            } while (5 > alvo || alvo > 10);
            /*conforme descrito no exercicio
             o alvo tem que receber valores
             entre 5 e 10 nada alem nem aquém
             disso*/
            do {
                System.out.println("Digite um valor positivo para a distancia entre o alvo e o canhao:");
                dist = ent.nextDouble();
            } while (dist <= 0);
            if (alcanceh >= (dist - (alvo / 2))) {
                if (alcanceh <= (dist + (alvo / 2))) {
                    /*o alvo cresce nas duas direções por isso coloquei
                     (distancia - alvo/2) e (distancia + alvo/2) (cresce 
                     metade para um lado e metade para o outro lado)*/
                    System.out.println("Parabens você acertou o alvo!");
                } else {
                    System.out.println("Você errou o alvo, o projétil passou do mesmo!");
                }
            } else {
                System.out.println("Você errou o alvo, o projétil caiu antes do mesmo!");
            }
            /*se o alvo nao for acertado e o projetil (alcance horizontal) ultrapassar  o alcance mais a
             metade do tamanho do alvo, o mesmo não sera acertado, senao o projetil ira cair antes
             de acertar o alvo*/
            System.out.println("O tempo do trajeto foi de " + String.format("%.4f", tempo) + " s");
            System.out.println("A altura maxima atingida pelo projétil foi de " + String.format("%.4f", altMax) + " m");
            /*o exercicio pede para que seja impresso tambem o tempo total do trajeto
             e a altura maxima atingida pelo projétil*/
            do {
                System.out.println("Deseja jogar novamente?\nsim\nnao");
                reset = ent.next();
            //mesma questão da linguagem nas linhas de codigo acima
                /*usei ".next()" nas duas Strings, pois nao interessa o que o
                 usuario vai digitar depois do espaço, ele só precisa digitar,
                 sim ou não*/
            } while (!reset.equalsIgnoreCase("sim") && !reset.equalsIgnoreCase("nao"));
        } while (reset.equalsIgnoreCase("sim"));
    
    }
}
