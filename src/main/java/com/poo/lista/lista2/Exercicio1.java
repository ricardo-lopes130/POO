package com.poo.lista.lista2;

import java.util.Scanner;

/*1) Escreva um programa que recebe um número digitado pelo usuário e responda
se o número inserido é par ou ímpar ou 0.*/

public class Exercicio1 {
    public static void resolucao2(){
        //Código de resolução: Exercicio1.resolucao2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();

        if(numero%2==0){
            System.out.println("Número par");
        }
        else{
            System.out.println("Número ímpar");
        }
    sc.close();
    }
}
