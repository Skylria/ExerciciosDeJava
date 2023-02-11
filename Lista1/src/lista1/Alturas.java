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
public class Alturas {
    public static void main(String[] args) {
    /*Exercício 4:
     * Desenvolver um programa que leia a altura de 15 pessoas. Este
     * programa deverá calcular e mostrar:
        a. A menor altura do grupo;
        b. A maior altura do grupo;
    */
        Scanner s1 = new Scanner(System.in);
        int[] heights = new int[15];
        for (int i = 0; i < 15; i++){
            System.out.println("Altura: ");
            heights[i] = s1.nextInt();
        }
        int minheight = 500;
        int maxheight = 0;
        for (int i : heights){
            if (i < minheight){
                minheight = i;
            }
            else if (i > maxheight){
                maxheight = i;
            }
        }
        System.out.println("A menor altura eh: " + minheight);
        System.out.println("A maior altura eh: " + maxheight);
    }
}
