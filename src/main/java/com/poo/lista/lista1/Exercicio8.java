package com.poo.lista.lista1;

import java.util.Scanner;

/*8) Suponha que voce trabalhe em um laboratório e seu
colega mediu a temperatura de um objeto em Fahrenheit.
Escreva um programa capaz de converter em Celsius.*/

public class Exercicio8 {
    public static void resolucao(){
        //Código de resolução: Exercicio8.resolucao();
        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheint;

        System.out.println("Escreva os graus em Celsius: ");
        celsius = sc.nextDouble();

        fahrenheint = celsius * 1.8 + 32;
        System.out.printf("Em Farenheint: %.2f ", fahrenheint);

    sc.close();
    }
}
