/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Intervalos {
    public static void main(String[] args) {
        /*Exercício 5: 
     * Escrever um algoritmo que leia uma quantidade desconhecida de
     * números e conte quantos deles estão nos seguintes intervalos: [0-25],
     * [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando
     * for lido um número negativo.
     */   
        int number = 0;
        int cont25 = 0;
        int cont50 = 0;
        int cont75 = 0;
        int cont100 = 0;
        while (number >= 0){
            Scanner s2 = new Scanner(System.in);
            System.out.println("digite um numero: ");
            number = s2.nextInt();
            if (number < 25){
                cont25+=1; 
            }
            else if (number < 50){
                cont50+=1;
            }
            else if (number < 75){
                cont75+=1;
            }
            else if (number < 100){
                cont100+=1;
            }
        }
        System.out.println("Existem " + cont25 + " numeros no intervalo entre 0 e 25");
        System.out.println("Existem " + cont50 + " numeros no intervalo entre 26 e 50");
        System.out.println("Existem " + cont75 + " numeros no intervalo entre 51 e 75");
        System.out.println("Existem " + cont100 + " numeros no intervalo entre 76 e 100");
    }
}
